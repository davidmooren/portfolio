import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { BeerEditComponent } from './beer-edit/beer-edit.component';
import { BeerListComponent } from './beer-list/beer-list.component';

export const appRoutes: Routes = [
  { 
    path: '', 
    redirectTo: '/beer-list', 
    pathMatch: 'full' },
  {
    path: 'beer-list',
    component: BeerListComponent
  },
  {
    path: 'beer-add',
    component: BeerEditComponent
  },
  {
    path: 'beer-edit/:id',
    component: BeerEditComponent
  }
];




