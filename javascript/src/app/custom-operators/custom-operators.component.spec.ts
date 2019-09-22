import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomOperatorsComponent } from './custom-operators.component';

describe('CustomOperatorsComponent', () => {
  let component: CustomOperatorsComponent;
  let fixture: ComponentFixture<CustomOperatorsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CustomOperatorsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomOperatorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
