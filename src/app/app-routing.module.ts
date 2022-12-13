import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutUsComponent } from './about-us/about-us.component';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { CreateDepartmentComponent } from './create-department/create-department.component';
import { CreateHrComponent } from './create-hr/create-hr.component';
import { DepartmentListComponent } from './department-list/department-list.component';
import { UserHomeComponent } from './user-home/user-home.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';


const routes: Routes = [{ path: '', component:WelcomePageComponent},
  {path: 'adminhome',component:AdminHomeComponent},
  {path:'userLogin',component:AdminLoginComponent},
  
  {path: 'userhome', component: UserHomeComponent},
  {path: 'createHr',component:CreateHrComponent},
  {path: 'contact', component:ContactUsComponent},
  {path: 'aboutus', component:AboutUsComponent},
  {path: 'adminLogin',component:AdminLoginComponent},
  {path: 'welcomepage',component:WelcomePageComponent},
  {path: 'createdepartment',component:CreateDepartmentComponent},
  {path: 'departmentlist',component:DepartmentListComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
