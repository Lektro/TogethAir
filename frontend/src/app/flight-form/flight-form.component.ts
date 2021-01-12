import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {FlightService} from '../service/flight.service';
import {Flight} from '../model/flight';
import {Airport} from "../model/airport";
import {AirportService} from "../service/airport.service";
import {Airline} from "../model/airline";

@Component({
  selector: 'app-flight-form',
  templateUrl: './flight-form.component.html',
  styleUrls: ['./flight-form.component.css']
})
export class FlightFormComponent implements OnInit {

  flight: Flight;
  flights: Flight[] = [];
  airports: Airport[] = [];
  airlines: Airline[] = [];


  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private flightService: FlightService,
    private airportService: AirportService) {
    this.flight = new Flight();
  }

  onSubmit() {
    this.flightService.save(this.flight).subscribe(result => this.gotoFlightList());
  }

  gotoFlightList() {
    this.router.navigate(['/flights']);
  }

  ngOnInit(): void {
    this.airportService.findAll().subscribe(result => this.airports = result)
  }

}
