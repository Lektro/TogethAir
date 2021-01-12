import {Component, OnInit} from '@angular/core';
import {Airport} from "../model/airport";
import {ActivatedRoute, Router} from "@angular/router";
import {AirportService} from "../service/airport.service";

@Component({
  selector: 'app-airport-form',
  templateUrl: './airport-form.component.html',
  styleUrls: ['./airport-form.component.css']
})
export class AirportFormComponent implements OnInit {

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

  ngOnInit(): void {
  }

}
