import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {FlightService} from "../service/flight.service";
import {Ticket} from "../model/ticket";
import {TicketService} from "../service/ticket.service";
import {Airport} from "../model/airport";
import {Airline} from "../model/airline";
import {Flight} from "../model/flight";
import {UserService} from "../service/user.service";
import {User} from "../model/user";

@Component({
  selector: 'app-ticket-form',
  templateUrl: './ticket-form.component.html',
  styleUrls: ['./ticket-form.component.css']
})
export class TicketFormComponent implements OnInit {
  id: string | null | undefined;
  ticket: Ticket;
  airline: Airline;
  flight: Flight;
  airport: Airport;
  tickets: Ticket[] = [];
  airports: Airport[] = [];
  airlines: Airline[] = [];
  flights: Flight[] = [];
  users: User[] = [];

  constructor(private route: ActivatedRoute,
              private router: Router,
              private flightService: FlightService,
              private ticketService: TicketService,
              private userService: UserService) {
    this.ticket = new Ticket();
    this.airline = new Airline();
    this.flight = new Flight();
    this.airport = new Airport();
  }
  onSubmit() {
    this.ticketService.save(this.ticket).subscribe(result => this.gotoTicketList());
  }
  gotoTicketList() {
    this.router.navigate(['/tickets']);
  }

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id');
    this.flightService.findAll().subscribe(flightData => this.flights = flightData)
    this.userService.findAll().subscribe(userData =>this.users = userData )
  }
  toggle(): void {}
}
