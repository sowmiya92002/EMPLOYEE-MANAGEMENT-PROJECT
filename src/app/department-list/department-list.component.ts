import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Department } from '../department';
import { DepartmentService } from '../department.service';

@Component({
  selector: 'app-department-list',
  templateUrl: './department-list.component.html',
  styleUrls: ['./department-list.component.css']
})
export class DepartmentListComponent {
  department:Department[] | undefined;

  constructor(private departmentService:DepartmentService,private route:Router) { }

  ngOnInit(): void {
    this.getDepartmentList();
  }

 
  
 private getDepartmentList()
{
  this.departmentService.getDepartmentListService().subscribe(data => {
    this.department = data;
  });}

 updateDepartment(dept_id:number)
  {
    this.route.navigate(['/updateplace',dept_id]);
  }
deleteDepartment(dept_id:number)
{
 
this.departmentService.deleteDepartentService(dept_id).subscribe(
  data=>{console.log("succuss"),
  this.getDepartmentList();},
  error=>console.log("error")
)
}
addEmployee(dept_id:number)
{
  this.route.navigate(['/createEmployee',dept_id])
}
viewEmployee(dept_id:number)
{
  this.route.navigate(['/employeelist',dept_id])
}

addHr(dept_id:number){
  this.route.navigate(['/createHr',dept_id])
}

viewHr(dept_id:number){
  this.route.navigate(['/hrlist',dept_id])
}

logOut()
{
  this.route.navigate(['/welcomepage'])
}
back()
{
  this.route.navigate(['/adminhome'])
}

}
