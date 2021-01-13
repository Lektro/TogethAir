import {Component} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {AirportService} from "../service/airport.service";
import {Airport} from "../model/airport";

@Component({
  selector: 'app-airport-form',
  templateUrl: './airport-form.component.html',
  styleUrls: ['./airport-form.component.css']
})
export class AirportFormComponent {

  airport: Airport;

  constructor(private route: ActivatedRoute,
              private router: Router,
              private airportService: AirportService,) {
    this.airport = new Airport();
  }

  onSubmit() {
    this.airportService.save(this.airport).subscribe(result => this.gotoAirportList());
  }

  gotoAirportList() {
    this.router.navigate(['/airports']);
  }
}
