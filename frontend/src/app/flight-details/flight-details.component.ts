import {Component, Inject, inject, OnInit} from '@angular/core';
import {Flight} from "../model/flight";
import {Airport} from "../model/airport";
import {FlightService} from "../service/flight.service";
import {AirportService} from "../service/airport.service";

@Component({
  selector: 'app-flight-details',
  templateUrl: './flight-details.component.html',
  styleUrls: ['./flight-details.component.css']
})
export class FlightDetailsComponent implements OnInit {

  flights: Flight[] = [];
  airports: Airport[] = [];
  private id: number | undefined;

  constructor(private flightService: FlightService, private airportsService: AirportService) {
  }

  ngOnInit() {
    // veiliger om te promise en then  subscribe is beter voor comm tussen twee components ipv services
    // services returnen enkel data, components bv chatstreams
    this.flightService.findById(this.id).subscribe((flightData: any) => {
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
