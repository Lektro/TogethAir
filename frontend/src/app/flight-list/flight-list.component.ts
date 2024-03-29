import { Component, OnInit } from '@angular/core';
import { Flight } from '../model/flight';
import { Airport } from '../model/airport';
import { FlightService } from '../service/flight.service';
import { AirportService} from "../service/airport.service";
import {TicketService} from "../service/ticket.service";

@Component({
  selector: 'app-flight-list',
  templateUrl: './flight-list.component.html',
  styleUrls: ['./flight-list.component.css']
})

export class FlightListComponent implements OnInit {
  id!: number;
  flights : Flight[] = [];
  flight: Flight = new Flight();
  airports: Airport[] = [];

  constructor(private ticketService: TicketService, private flightService: FlightService, private airportsService: AirportService) { }

  ngOnInit() {
    // veiliger om te promise en then  subscribe is beter voor comm tussen twee components ipv services
    // services returnen enkel data, components bv chatstreams
    this.flightService.findAll().subscribe((flightData: any) => {
      this.flights = flightData
    });
    this.airportsService.findAll().subscribe((airportData: any) => {
      this.airports = airportData
    });
  }

  delete(id: number) {
    // toPromise().then() closes the stream, subscribe does not close the stream
    this.flightService.delete(id).toPromise().then(() => {
      // redraws the table after delete
      return this.ngOnInit();
    })
  }
}
