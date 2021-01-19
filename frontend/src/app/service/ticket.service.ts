import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class TicketService {

  private readonly ticketUrl = 'http://localhost:8080/api/createTickets';

  constructor(private http: HttpClient) { }

  public create(data: any): Observable<any> {
    return this.http.post(this.ticketUrl, data);
  }
}
