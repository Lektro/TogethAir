import {UserRole} from "./userRole";

export class User {
  id: number | undefined;
  name: string | undefined;
  password: string | undefined;
  address: string | undefined;
  emailAddress: string | undefined;
  telephoneNumber: string | undefined;
  userRole: UserRole | undefined;
}
