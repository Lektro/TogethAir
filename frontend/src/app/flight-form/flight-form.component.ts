import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {FlightService} from '../service/flight.service';
import {Flight} from '../model/flight';
import {Airport} from "../model/airport";
import {AirportService} from "../service/airport.service";
import {Airline} from "../model/airline";
import {AirlineService} from "../service/airline.service";

@Component({
  selector: 'app-flight-form',
  templateUrl: './flight-form.component.html',
  styleUrls: ['./flight-form.component.css']
})
export class FlightFormComponent implements OnInit {

  flight: Flight;
  airline: Airline;
  flights: Flight[] = [];
  airports: Airport[] = [];
  airlines: Airline[] = [];


  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private flightService: FlightService,
    private airportService: AirportService,
    private airlineService: AirlineService) {
    this.flight = new Flight();
    this.airline = new Airline();
  }

  onSubmit() {
    this.flightService.save(this.flight).subscribe(result => this.gotoFlightList());
  }

  gotoFlightList() {
    this.router.navigate(['/flights']);
  }

  ngOnInit(): void {
      this.airportService.findAll().subscribe(result => this.airports = result),
      this.airlineService.findAll().subscribe(airlineResult => this.airlines = airlineResult);
  }

}
