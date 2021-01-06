import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Flight } from './model/flight';

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

}
