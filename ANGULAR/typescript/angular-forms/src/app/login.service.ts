import { Injectable } from "@angular/core";

@Injectable()
export class LoginService{
    checkUserDetails(login: any):string {
        if (login.email == "raj@gmail.com" && login.password == "123") {
           return  "Success";
    
        }
        else {
          return   "Failure ";
        }
    }
}