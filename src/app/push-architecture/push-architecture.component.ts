import { UserFacadeService } from './user-facade.service';
import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { UserState } from './interfaces/user-state';
import { Observable } from 'rxjs';
import { take, debounceTime, distinctUntilChanged } from 'rxjs/operators';

@Component({
  selector: 'app-push-architecture',
  templateUrl: './push-architecture.component.html',
  styleUrls: ['./push-architecture.component.css']
})
export class PushArchitectureComponent implements OnInit {

  searchValueControl = new FormControl();
  userStateManager: Observable<UserState> = this.userFacade.manager;

  constructor(
    private userFacade: UserFacadeService
  ) { }

  ngOnInit() {
    // uso patchValue para resgatar o valor setado inicialmente no state do facade
    this.userFacade.searchValue
    .pipe(
      take(1)
    )
    .subscribe(criteria => {
      this.searchValueControl.patchValue(criteria, {emitEvent: false});
    });

    // escuta pelas mudanças no valor do form para realizar chamadas no updateSearchCriteria
    this.searchValueControl.valueChanges
    .pipe(
      debounceTime(500),
      distinctUntilChanged()
    )
    .subscribe(newValue => {
      this.userFacade.updateSearchValue(newValue);
    });
  }
}
