import {Airport} from "./airport";
import {Airline} from "./airline";

export class Flight {
    // typscript error on delete altho the call does make it to the Spring Back End
    id: number | undefined;
    basePrice: number | undefined;
    flightNumber: string | undefined;
    // naamgeving moet overeenkomen met je model in java
    departureAirport: Airport | undefined;
    arrivalAirport : Airport | undefined;
    flightDuration: number | undefined;
    airline: Airline | undefined;
    totalSeats: number | undefined;
}
