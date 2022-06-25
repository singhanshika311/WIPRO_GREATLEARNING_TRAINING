import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { CustomService } from '../custom.service';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-tdf-login-page',
  templateUrl: './tdf-login-page.component.html',
  styleUrls: ['./tdf-login-page.component.css']
})
export class TdfLoginPageComponent implements OnInit {
  msg: string = "";
  //constructor(public ls:LoginService) { }

  ngOnInit(): void {
  }

  //here NgFormis a API
  checkUserDetails(loginRef: NgForm) {
    let login = loginRef.value;

    //for custom.service.ts
    // let obj=new CustomService();
    // this.msg=obj.checkUserDetails(login);


    // if (login.email == "raj@gmail.com" && login.password == "123") {
    //   this.msg = "Succesfully Login";

    // }
    // else {
    //   this.msg = "Failure !try Once Again";
    // }
  //for login.service.ts
    //this.msg=this.ls.checkUserDetails(login);

    loginRef.reset();
  }

}
