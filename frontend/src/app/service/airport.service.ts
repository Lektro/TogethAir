import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Airport} from "../model/airport";

@Injectable({
  providedIn: 'root'
})
export class AirportService {

  private readonly airportUrl: string;

  constructor(private http: HttpClient) {
    this.airportUrl = 'http://localhost:8080/api/airports';
  }

  public findAll(): Observable<Airport[]> {
    return this.http.get<Airport[]>(this.airportUrl);
  }

  public save(airport: Airport) {
    return this.http.post<Airport>(this.airportUrl, airport);
  }

  public findAllAirports(): Observable<Airport[]> {
    return this.http.get<Airport[]>(this.airportUrl);
  }

}
