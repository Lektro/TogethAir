import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FlightListComponent } from './flight-list/flight-list.component';
import { FlightFormComponent } from './flight-form/flight-form.component';
import { AirportListComponent } from "./airport-list/airport-list.component";
import { AirlineListComponent } from "./airline-list/airline-list.component";
import { AirportFormComponent } from "./airport-form/airport-form.component";
import {UserListComponent} from "./user-list/user-list.component";
import {UserFormComponent} from "./user-form/user-form.component";
import {TicketFormComponent} from "./ticket-form/ticket-form.component";

const routes: Routes = [
    { path: 'addFlight', component: FlightFormComponent },
    { path: 'addAirport', component: AirportFormComponent },
    { path: 'flights', component: FlightListComponent },
    { path: 'airports', component: AirportListComponent },
    { path: 'airlines', component: AirlineListComponent },
    { path: 'deleteFlight', component: FlightListComponent },
    { path: 'users', component: UserListComponent },
    { path: 'addUser', component: UserFormComponent },
    { path: 'addTicket', component: TicketFormComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
