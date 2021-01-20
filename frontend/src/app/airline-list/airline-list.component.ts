import { Component, OnInit } from '@angular/core';
import {AirlineService} from "../service/airline.service";
import {Airline} from "../model/airline";

@Component({
  selector: 'app-airline-list',
  templateUrl: './airline-list.component.html',
  styleUrls: ['./airline-list.component.css']
})
export class AirlineListComponent implements OnInit {

  airlines : Airline[] = [];

  constructor(private airlineService: AirlineService) { }

  ngOnInit(): void {
    this.airlineService.findAll().subscribe(data => { this.airlines = data;
    });
  }

}
