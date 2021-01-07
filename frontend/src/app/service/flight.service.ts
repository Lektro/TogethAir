import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Flight } from '../model/flight';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FlightService {
    private flightsUrl = 'http://localhost:8080/api/flights';

    constructor(private http: HttpClient) {
    }

    public findAll() {
      return this.http.get(this.flightsUrl);
    }

    public save(flight: Flight) {
      return this.http.post<Flight>(this.flightsUrl, flight);
    }
}
