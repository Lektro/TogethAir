import { Component, OnInit } from '@angular/core';
import {Airport} from "../model/airport";
import {AirportService} from "../service/airport.service";

@Component({
  selector: 'app-airport-list',
  templateUrl: './airport-list.component.html',
  styleUrls: ['./airport-list.component.css']
})
export class AirportListComponent implements OnInit {

  airports: Airport[] = [];

  constructor(private airportService: AirportService) { }

  ngOnInit() {
    this.airportService.findAll().subscribe(data => {
      this.airports = data;
    });
  }

}
