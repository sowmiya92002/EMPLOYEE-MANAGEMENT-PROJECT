import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';

import { Observable } from 'rxjs';
import { Admin } from './admin';
@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http:HttpClient) { }
  
  public adminLoginService(admin:Admin):Observable<any>
  {
    return this.http.post<any>("http://localhost:8089/api/admin/login",admin)
  }
} 