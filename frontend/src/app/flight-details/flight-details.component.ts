import {Component, Inject, inject, OnInit} from '@angular/core';
import {Flight} from "../model/flight";
import {FlightService} from "../service/flight.service";
import {AirportService} from "../service/airport.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-flight-details',
  templateUrl: './flight-details.component.html',
  styleUrls: ['./flight-details.component.css']
})
export class FlightDetailsComponent implements OnInit {

  flight: Flight = new Flight();
  public id!: number;

  constructor(private activatedRoute: ActivatedRoute, private flightService: FlightService, private airportsService: AirportService) {
  }

  ngOnInit() {

    this.activatedRoute.paramMap.subscribe(params => {
      this.id = Number.parseInt(<string>params.get('id'));
    });

    this.flightService.findById(this.id).subscribe(flightData => {
      this.flight = flightData;
    })

  }

  delete(id: number) {
    // toPromise().then() closes the stream, subscribe does not close the stream
    this.flightService.delete(id).toPromise().then(() => {
      // redraws the table after delete
      return this.ngOnInit();
    })
  }

  orderTickets(id: number) {
    this.flightService.findById(this.id).subscribe(flightData => {
      this.flight = flightData;
    })
  }
}
