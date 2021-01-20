import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class TicketService {

  private readonly createTicketUrl = 'http://localhost:8080/api/createTickets';
  private readonly ticketUrl = 'http://localhost:8080/api/tickets';
  constructor(private http: HttpClient) { }

  public create(data: any): Observable<any> {
    return this.http.post(this.createTicketUrl, data);
  }
  public findAll() {
    return this.http.get(this.ticketUrl);
  }
}
