import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PushArchitectureComponent } from './push-architecture.component';

describe('PushArchitectureComponent', () => {
  let component: PushArchitectureComponent;
  let fixture: ComponentFixture<PushArchitectureComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PushArchitectureComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PushArchitectureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
