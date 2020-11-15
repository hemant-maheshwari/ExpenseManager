import {Inject, Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

import { User } from '../_models/user';


@Injectable({providedIn: 'root'})
export class UserService{
// https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch

  constructor(private http: HttpClient) {

  }
  register(user: User) {
    return this.http.post(`${config.apiUrl}/users/register`, user);
  }
}
