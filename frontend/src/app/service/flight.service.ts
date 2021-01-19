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
  private readonly airportUrl = 'http://localhost:8080/api/airports';
  private readonly airlineUrl = 'http://localhost:8080/api/airlines';
  // deze is overbodig als je je backend aanpast
  private readonly addFlightUrl = 'http://localhost:8080/api/addFlights';

  constructor(private http: HttpClient) {

  }

  public findAll() {
    return this.http.get(this.flightsUrl);
  }

  public findAllAirports(): Observable<Airport[]> {
    return this.http.get<Airport[]>(this.airportUrl);
  }

  public findAllAirlines(): Observable<Airline[]> {
    return this.http.get<Airline[]>(this.airlineUrl);
  }

  public save(flight: Flight) {
    return this.http.post<Flight>(this.addFlightUrl, flight);
  }

  public create(data: any): Observable<any> {
    return this.http.post(this.addFlightUrl, data);
  }

  // mooi voorbeeld om maar 1 url te gebruiken in uw back end
  delete(id: number): Observable<any> {
    return this.http.delete(`${this.flightsUrl}/${id}`);
  }

  // search werkt nog niet
  //public findByName(name: any): Observable<Flight[]> {
    //return this.http.get<Flight[]>(`${this.flightsUrl}?name=${name}`);
  //}

  public findById(id: any): Observable<Object> {
    return this.http.get(`${this.flightsUrl}?id=${id}`)
  }
}
