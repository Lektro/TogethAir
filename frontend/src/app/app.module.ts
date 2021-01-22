import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { FlightListComponent } from './flight-list/flight-list.component';
import { FlightFormComponent } from './flight-form/flight-form.component';
import { FlightService } from './service/flight.service';
import { AirportListComponent } from './airport-list/airport-list.component';
import { AirportService } from "./service/airport.service";
import { AirlineListComponent } from './airline-list/airline-list.component';
import { AirportFormComponent } from './airport-form/airport-form.component';
import { UserListComponent } from './user-list/user-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import { TicketFormComponent } from './ticket-form/ticket-form.component';
import { AirlineFormComponent } from './airline-form/airline-form.component';
import { FlightDetailsComponent } from './flight-details/flight-details.component';
import { FilterPipePipe } from './pipes/filter-pipe.pipe';
import { TicketListComponent } from './ticket-list/ticket-list.component';


@NgModule({
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule

  ],

  declarations: [
    AppComponent,
    FlightListComponent,
    AirportListComponent,
    AirlineListComponent,
    // this one needs to be loaded last?
    FlightFormComponent,
    AirportFormComponent,
    UserListComponent,
    UserFormComponent,
    TicketFormComponent,
    AirlineFormComponent,
    FlightDetailsComponent,
    FilterPipePipe,
    TicketListComponent,

  ],

  providers: [FlightService, AirportService, AirportService],
  bootstrap: [AppComponent]
})
export class AppModule { }
