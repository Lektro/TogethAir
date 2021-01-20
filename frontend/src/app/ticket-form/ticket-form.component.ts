import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {FlightService} from "../service/flight.service";
import {Ticket} from "../model/ticket";
import {TicketService} from "../service/ticket.service";
import {AirportService} from "../service/airport.service";
import {AirlineService} from "../service/airline.service";
import {Airport} from "../model/airport";
import {Airline} from "../model/airline";
import {Flight} from "../model/flight";

@Component({
  selector: 'app-ticket-form',
  templateUrl: './ticket-form.component.html',
  styleUrls: ['./ticket-form.component.css']
})
export class TicketFormComponent implements OnInit {

  ticket: Ticket;
  airline: Airline;
  flight: Flight;
  airport: Airport;
  tickets: Ticket[] = [];
  airports: Airport[] = [];
  airlines: Airline[] = [];
  flights: Flight[] = [];


  constructor(private route: ActivatedRoute,
              private router: Router,
              private flightService: FlightService,
              private ticketService: TicketService,) {
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
    this.flightService.findAll().subscribe(flightData => this.flights = flightData)
  }
  toggle(): void {}
}
