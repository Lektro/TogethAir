import { Component, OnInit } from '@angular/core';
import {TicketService} from "../service/ticket.service";
import {Ticket} from "../model/ticket";


@Component({
  selector: 'app-ticket-list',
  templateUrl: './ticket-list.component.html',
  styleUrls: ['./ticket-list.component.css']
})
export class TicketListComponent implements OnInit {

  id!: number;
  tickets: Ticket[] = [];

  constructor(private ticketService: TicketService) {
  }

  ngOnInit() {
    this.ticketService.findAll().toPromise().then((ticketData) => {
      this.tickets = ticketData
    });
  }

  delete(id: number) {
    this.ticketService.delete(id).toPromise().then(() => {
      return this.ngOnInit();
    });
  }
}
