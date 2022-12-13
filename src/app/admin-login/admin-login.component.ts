import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit{

  admin=new Admin("","");
  message=""
    constructor(private adminService:AdminService,private router:Router) { }
  
    ngOnInit(): void {
    }
  adminLogin()
  {
  this.adminService.adminLoginService(this.admin).subscribe(
    data =>{console.log("Login success"),
    this.router.navigate(['/department'])},
    error =>{console.log("Login Failed"),console.log(error),
  
    this.message="login failed.enter valid email and password"}
  )
  
  }
  back()
  {
    this.router.navigate(['/welcomepage'])
  }
  home(){
    console.log("login success")
    this.router.navigate(['/adminhome'])
  }
}
