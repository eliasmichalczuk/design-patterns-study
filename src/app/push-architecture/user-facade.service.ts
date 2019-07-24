import { Injectable } from '@angular/core';
import { BehaviorSubject, combineLatest, Observable } from 'rxjs';
import { UserState, RandomUserResponse } from './interfaces/user-state';
import { map, distinctUntilChanged, switchMap, tap } from 'rxjs/operators';
import { Pagination } from './interfaces/pagination';
import { User } from './interfaces/user';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserFacadeService {

  private _state: UserState = {
    users: [],
    criteria: 'michalczuk',
    pagination: {
      currentPage: 0,
      selectedSize: 5,
      pageSizes: [5, 10, 20, 50],
      pageNumbers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    },
    loading: false
  };
  private _store = new BehaviorSubject<UserState>(this._state);
  private stateObs = this._store.asObservable();

  private _users = this.stateObs.pipe(map(state => state.users), distinctUntilChanged());
  public searchValue = this.stateObs.pipe(map(state => state.criteria), distinctUntilChanged());
  public pagination = this.stateObs.pipe(map(state => state.pagination), distinctUntilChanged());
  private _loading = this.stateObs.pipe(map(state => state.loading));

  public manager: Observable<UserState> = combineLatest(this.pagination, this.searchValue, this._users, this._loading).pipe(
    map(([pagination, criteria, users, loading]) => {
      return { pagination, criteria, users, loading };
    })
  );

  constructor(private http: HttpClient) {
    combineLatest(this.searchValue, this.pagination)
      .pipe(
        switchMap(([criteria, pagination]) => {
          return this.findAllUsers(criteria, pagination);
        })
      ).subscribe(users => {
        this.updateState({ ...this._state, users, loading: false });
      });
  }

  updateSearchValue(criteria: string) {
    this.updateState({ ...this._state, criteria, loading: true });
  }

  updatePagination(selectedSize: number, currentPage: number = 0) {
    const pagination: Pagination = { ...this._state.pagination, currentPage, selectedSize };
    this.updateState({ ...this._state, pagination, loading: true });
  }

  updateCurrentPage(currentPage: number) {
    const pagination: Pagination = { ...this._state.pagination, currentPage};
    this.updateState({ ...this._state, pagination, loading: true });
  }

  private updateState(state: UserState) {
    this._store.next(this._state = state);
  }

  private findAllUsers(criteria: string, pagination: Pagination): Observable<User[]> {
    const url = buildUserUrl(criteria, pagination);
    return this.http.get<RandomUserResponse>(url).pipe(
      map(response => response.results)
    );
  }
}
function buildUserUrl(criteria: string, pagination: Pagination): string {
  const URL = 'https://randomuser.me/api/';
  return `${URL}?seed=${criteria}&results=${pagination.selectedSize}&page=${pagination.currentPage}`;
}
