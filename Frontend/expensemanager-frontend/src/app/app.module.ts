import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent} from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { routing } from './app-routing.module';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { FriendsComponent } from './friends/friends.component';
import { ActivityComponent } from './activity/activity.component';
import { TransactionComponent } from './transaction/transaction.component';
import { AccountComponent } from './account/account.component';
import { AddFriendComponent } from './add-friend/add-friend.component';
import { ExpensesComponent } from './expenses/expenses.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    ForgotPasswordComponent,
    FriendsComponent,
    ActivityComponent,
    TransactionComponent,
    AccountComponent,
    AddFriendComponent,
    ExpensesComponent
  ],
  imports: [
    routing,
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
