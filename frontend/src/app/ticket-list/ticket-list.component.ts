import { Component, OnInit } from '@angular/core';
import {UserService} from "../service/user.service";
import {User} from "../model/user";
import {TicketService} from "../service/ticket.service";
import {Ticket} from "../model/ticket";

@Component({
  selector: 'app-ticket-list',
  templateUrl: './ticket-list.component.html',
  styleUrls: ['./ticket-list.component.css']
})
export class TicketListComponent implements OnInit {

  tickets: Ticket[] = [];
  // I need to grab the other controllers aswell? the list does not get seeded yet
  constructor(private ticketService: TicketService) { }

  ngOnInit() {
    this.ticketService.findAll().subscribe((ticketData: any) => {
      this.tickets = ticketData
    });
  }

}
