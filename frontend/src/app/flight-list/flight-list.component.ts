import { Component, OnInit } from '@angular/core';
import { Flight } from '../model/flight';
import { Airport } from '../model/airport';
import { FlightService } from '../service/flight.service';
import { AirportService} from "../service/airport.service";

@Component({
  selector: 'app-flight-list',
  templateUrl: './flight-list.component.html',
  styleUrls: ['./flight-list.component.css']
})

export class FlightListComponent implements OnInit {

  flights : Flight[] =[];
  airports: Airport[] = [];

  constructor(private flightService: FlightService, private airportsService: AirportService) { }

  ngOnInit() {
    this.flightService.findAll().subscribe((flightData: any) => {
      this.flights = flightData
    });
    this.airportsService.findAll().subscribe((airportData: any) => {
      this.airports = airportData
    });


  }
}
