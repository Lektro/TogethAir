import {Flight} from "./flight";
import {User} from "./user";

export class Ticket {
    id: number | undefined;
    flight: Flight | undefined;
    user: User | undefined;
}
