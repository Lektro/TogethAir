import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FlightListComponent } from './flight-list/flight-list.component';
import { FlightFormComponent } from './flight-form/flight-form.component';
import { AirportListComponent } from "./airport-list/airport-list.component";
import { AirlineListComponent } from "./airline-list/airline-list.component";

const routes: Routes = [
    { path: 'flights', component: FlightListComponent },
    { path: 'airports', component: AirportListComponent },
    { path: 'airlines', component: AirlineListComponent },
    { path: 'addflight', component: FlightFormComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
