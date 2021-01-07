import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FlightService } from '../service/flight.service';
import { Flight } from '../model/flight';

@Component({
  selector: 'app-flight-form',
  templateUrl: './flight-form.component.html',
  styleUrls: ['./flight-form.component.css']
})
export class FlightFormComponent implements OnInit {

  flight : Flight;
  flights : Flight[] =[];

  constructor(
      private route: ActivatedRoute,
          private router: Router,
              private flightService: FlightService) {
      this.flight = new Flight();
  }

  onSubmit() {
    this.flightService.save(this.flight).subscribe(result => this.gotoFlightList());
  }

  gotoFlightList() {
    this.router.navigate(['/flights']);
  }

  ngOnInit(): void {
  }

}