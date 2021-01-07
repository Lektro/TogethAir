import { Component, OnInit } from '@angular/core';
import { Flight } from '../model/flight';
import { FlightService } from '../service/flight.service';

@Component({
  selector: 'app-flight-list',
  templateUrl: './flight-list.component.html',
  styleUrls: ['./flight-list.component.css']
})

export class FlightListComponent implements OnInit {

  flights : Flight[] =[];

  constructor(private flightService: FlightService) { }

  ngOnInit() {
    this.flightService.findAll().subscribe((data: any) => { this.flights = data;
    });
  }

}
