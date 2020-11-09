import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LoginComponent} from './login/login.component';
import {RegisterComponent} from './register/register.component';
import {ForgotPasswordComponent} from './forgot-password/forgot-password.component';
import {ExpensesComponent} from './expenses/expenses.component';
import {TransactionComponent} from './transaction/transaction.component';
import {FriendsComponent} from './friends/friends.component';
import {AddFriendComponent} from './add-friend/add-friend.component';
import {AccountComponent} from './account/account.component';
import {ActivityComponent} from './activity/activity.component';

const routes: Routes = [
  {path: '', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'forgot-password', component: ForgotPasswordComponent},
  {path: 'expenses', component: ExpensesComponent},
  {path: 'transaction', component: TransactionComponent},
  {path: 'friends', component: FriendsComponent},
  {path: 'add-friend', component: AddFriendComponent},
  {path: 'account', component: AccountComponent},
  {path: 'activity', component: ActivityComponent}
];

export const routing = RouterModule.forRoot(routes);

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
