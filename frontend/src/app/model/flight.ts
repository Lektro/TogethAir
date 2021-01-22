import {Airport} from "./airport";
import {Airline} from "./airline";

export class Flight {
    // typescript error on delete although the call does make it to the Spring Back End
    id: number | undefined;
    basePrice: number | undefined;
    advertisedPrice: number | undefined;
    employeeOverridePrice: number | undefined;
    flightNumber: string | undefined;

    // make sure these names are the same as your Flight.java Class
    departureAirport: Airport | undefined;
    arrivalAirport : Airport | undefined;

    flightDuration: number | undefined;
    airline: Airline | undefined;

    totalSeats: number | undefined;
    totalAvailableSeats: number | undefined;

    totalEconomyClassSeats: number | undefined;
    availableEconomyClassSeats: number | undefined;

    totalFirstClassSeats: number | undefined;
    availableFirstClassSeats: number | undefined;

    totalBusinessClassSeats: number | undefined;
    availableBusinessClassSeats: number | undefined;

  // naamgeving moet overeenkomen met je model in java voorlopig strings voor datums en tijden (out of scope)
  // ints/number voor de hoeveelheid seats bij te houden..
    departureTime: Date | undefined;
    arrivalTime: Date | undefined;
}
