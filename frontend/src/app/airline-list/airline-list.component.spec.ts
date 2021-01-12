import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AirlineListComponent } from './airline-list.component';

describe('AirlineListComponent', () => {
  let component: AirlineListComponent;
  let fixture: ComponentFixture<AirlineListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AirlineListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AirlineListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
