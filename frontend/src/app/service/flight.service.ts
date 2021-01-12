import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Flight } from '../model/flight';
import { Observable } from 'rxjs';
import {Airport} from "../model/airport";
import {Airline} from "../model/airline";

@Injectable({
  providedIn: 'root'
})
export class FlightService {

  private readonly flightsUrl = 'http://localhost:8080/api/flights';
  private readonly airportUrl: string;
  private readonly airlineUrl: string;

  constructor(private http: HttpClient) {
    this.airportUrl = 'http://localhost:8080/api/airports';
    this.flightsUrl = 'http://localhost:8080/api/flights';
    this.airlineUrl = 'http://localhost:8080/api/airlines';
  }

  public findAll() {
    return this.http.get(this.flightsUrl);
  }

  public save(flight: Flight) {
    return this.http.post<Flight>(this.flightsUrl, flight);
  }

  public findAllAirports(): Observable<Airport[]> {
    return this.http.get<Airport[]>(this.airportUrl);
  }

  public findAllAirlines(): Observable<Airline[]> {
    return this.http.get<Airline[]>(this.airlineUrl);
  }
}
