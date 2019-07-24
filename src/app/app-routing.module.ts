import { PushArchitectureComponent } from './push-architecture/push-architecture.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: 'push-architecture',
    component: PushArchitectureComponent
  },
  {
    path: '**',
    component: PushArchitectureComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
