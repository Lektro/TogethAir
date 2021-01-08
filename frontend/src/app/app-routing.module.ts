import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FlightListComponent } from './flight-list/flight-list.component';
import { FlightFormComponent } from './flight-form/flight-form.component';
import {AirportListComponent} from "./airport-list/airport-list.component";

const routes: Routes = [
    { path: 'flights', component: FlightListComponent },
    { path: 'addflight', component: FlightFormComponent },
  { path: 'airports', component: AirportListComponent },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
