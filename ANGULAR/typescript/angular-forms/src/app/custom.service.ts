export class CustomService{
    checkUser(login:any):string{
        if (login.email == "veers5080@gmail.com" && login.password == "123")
        {
            return "success"
        }
        else{
            return " try again"
        }

    }
}