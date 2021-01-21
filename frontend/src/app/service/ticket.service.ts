import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Flight} from "../model/flight";
import {Ticket} from "../model/ticket";

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
  public findAll(): Observable<Ticket[]> {
    return this.http.get<Ticket[]>(this.ticketUrl);
  }

  public save(ticket: Ticket) {
    return this.http.post<Ticket>(this.createTicketUrl, ticket);
  }
  // mooi voorbeeld om maar 1 url te gebruiken in uw back end observable to actually grab the object
  delete(id: number): Observable<Ticket> {
    return this.http.delete<Ticket>(`${this.ticketUrl}/${id}`);
  }
}
