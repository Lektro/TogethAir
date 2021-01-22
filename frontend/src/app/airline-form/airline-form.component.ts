import { Component, OnInit } from '@angular/core';
import {Airline} from "../model/airline";
import {ActivatedRoute, Router} from "@angular/router";
import {AirlineService} from "../service/airline.service";

@Component({
  selector: 'app-airline-form',
  templateUrl: './airline-form.component.html',
  styleUrls: ['./airline-form.component.css']
})
export class AirlineFormComponent {
  airline: Airline;

  constructor(private route: ActivatedRoute,
              private router: Router,
              private airlineService: AirlineService) {
    this.airline = new Airline();
  }

  onSubmit() {
    this.airlineService.save(this.airline).subscribe(result => this.gotoAirlineList());
  }

  gotoAirlineList() {
    this.router.navigate(['/airlines']);
  }
}
