import { User } from './user';
import { Pagination } from './pagination';

export interface UserState {
  users: User[];
  pagination: Pagination;
  criteria: string;
  loading: boolean;
}

export interface RandomUserResponse {
  results: User[];
}
