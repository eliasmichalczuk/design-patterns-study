import { CustomOperatorsComponent } from './custom-operators/custom-operators.component';
import { PushArchitectureComponent } from './push-architecture/push-architecture.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: 'push-architecture',
    component: PushArchitectureComponent
  },
  {
    path: 'operators',
    component: CustomOperatorsComponent
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
