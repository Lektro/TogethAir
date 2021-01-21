import {UserRole} from "./userRole";

export class User {
  // I need a ticket model and service first, then we can add them to a user id
  id: number | undefined;
  name: string | undefined;
  password: string | undefined;
  address: string | undefined;
  emailAddress: string | undefined;
  telephoneNumber: string | undefined;
  userRole: UserRole | undefined;
}
