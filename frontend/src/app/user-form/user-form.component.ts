import { Component, OnInit } from '@angular/core';
import {UserService} from "../service/user.service";
import {User} from "../model/user";
import {ActivatedRoute, Router} from "@angular/router";
import {UserRole} from "../model/userRole";

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {
  user: User ;
  users: User[] =[];
  userRole = UserRole;

  constructor(private route: ActivatedRoute, private userService: UserService,private router: Router) {
    this.user =  new User();
  }

  onSubmit() {
    this.userService.save(this.user).subscribe(result => this.gotoUserList());
  }

  ngOnInit(): void {
    this.userService.findAll().subscribe(result => this.users = result)
  }
  gotoUserList() {
    this.router.navigate(['/users']);
  }
  toggle(): void {}
}
