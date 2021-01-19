import {Component, Inject, inject, OnInit} from '@angular/core';
import {Flight} from "../model/flight";
import {Airport} from "../model/airport";
import {FlightService} from "../service/flight.service";
import {AirportService} from "../service/airport.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-flight-details',
  templateUrl: './flight-details.component.html',
  styleUrls: ['./flight-details.component.css']
})
export class FlightDetailsComponent implements OnInit {

  // typescript needs a new object for some reason
  flight: Flight = new Flight();
  airports: Airport[] = [];
  public id!: number;

  constructor(private activatedRoute: ActivatedRoute, private flightService: FlightService, private airportsService: AirportService) {
  }

  ngOnInit() {

    this.activatedRoute.paramMap.subscribe(params => {
      this.id = Number.parseInt(<string>params.get('id')) ;
    });

    this.flightService.findById(this.id).subscribe( flightData => {
      this.flight = flightData;
    })

/*    this.airportsService.findAll().subscribe((airportData: any) => {
      this.airports = airportData
    });*/
  }
  delete(id: number) {
    // toPromise().then() closes the stream, subscribe does not close the stream
    this.flightService.delete(id).toPromise().then(() => {
      // redraws the table after delete
      return this.ngOnInit();
    })
  }
}
