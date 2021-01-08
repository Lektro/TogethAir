import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Flight } from '../model/flight';
import { Observable } from 'rxjs';
import {Airport} from "../model/airport";

@Injectable({
  providedIn: 'root'
})
export class FlightService {
    private readonly flightsUrl = 'http://localhost:8080/api/flights';

    public findAll() {
      return this.http.get(this.flightsUrl);
    }

    public save(flight: Flight) {
      return this.http.post<Flight>(this.flightsUrl, flight);
    }

  private readonly airportUrl: string;

  constructor(private http: HttpClient) {
    this.airportUrl = 'http://localhost:8080/api/airports';
    this.flightsUrl = 'http://localhost:8080/api/flights';
  }

  public findAllAirports(): Observable<Airport[]> {
    return this.http.get<Airport[]>(this.airportUrl);
  }
}
