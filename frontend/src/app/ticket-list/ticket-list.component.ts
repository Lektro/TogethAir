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
  // I need to grab the other controllers aswell? the list does not get seeded yet
  constructor(private ticketService: TicketService) {
  }

  ngOnInit() {
    this.ticketService.findAll().toPromise().then((ticketData) => {
      this.tickets = ticketData
    });
  }

  delete(id: number) {
    // toPromise().then() closes the stream, subscribe does not close the stream
    this.ticketService.delete(id).toPromise().then(() => {
      // redraws the table after delete
      return this.ngOnInit();
    })
  }

}
