import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Flight} from "../model/flight";
import {User} from "../model/user";

@Injectable({
  providedIn: 'root'
})
export class UserService {
  private readonly addUserUrl = 'http://localhost:8080/api/addUser';
  private readonly userUrl = 'http://localhost:8080/api/users';
  private readonly getUserByIdUrl = 'http://localhost:8080/api/getUserById';


  constructor(private http: HttpClient) { }

  public create(data: any): Observable<any> {
    return this.http.post(this.addUserUrl, data);
  }
  public findAll() {
    return this.http.get(this.userUrl);
  }
  findById(id: number): Observable<any> {
    return this.http.get(`${this.getUserByIdUrl}/${id}`)
  }
  public save(user: User) {
    return this.http.post<Flight>(this.addUserUrl, user);
  }
}
