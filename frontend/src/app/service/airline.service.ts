import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Airline} from "../model/airline";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class AirlineService {
    private readonly airlineUrl: string;

    constructor(private http: HttpClient) {
      this.airlineUrl = 'http://localhost:8080/api/airlines'
    }

    public findAll(): Observable<Airline[]> {
      return this.http.get<Airline[]>(this.airlineUrl);
    }

    public save(airline: Airline) {
      return this.http.post<Airline>(this.airlineUrl, airline);
    }
}
