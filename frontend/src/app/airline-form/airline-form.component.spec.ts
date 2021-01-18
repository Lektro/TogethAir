import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AirlineFormComponent } from './airline-form.component';

describe('AirlineFormComponent', () => {
  let component: AirlineFormComponent;
  let fixture: ComponentFixture<AirlineFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AirlineFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AirlineFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
