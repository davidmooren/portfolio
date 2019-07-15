import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

// ---------------------------------
import { HttpClientModule } from '@angular/common/http';
//Para rutas
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { BeerEditComponent } from './beer-edit/beer-edit.component';
import { BeerListComponent } from './beer-list/beer-list.component';

import { appRoutes } from './routerConfig';

// LO siguiente es solo para la v2
// Quiza habria sido mejor ponerlo en un fichero llamado routerConfig.ts para separarlo
// Para hacerlo asi deberia ser algo como 

/*
// routerConfig.ts

import { Routes } from '@angular/router';
import { BeerEditComponent } from './beer-edit/beer-edit.component';
import { BeerListV2Component } from './beer-list-V2/beer-list-V2.component';

const appRoutes: Routes = [
  { 
    path: '', 
    redirectTo: '/beer-list', 
    pathMatch: 'full' },
  {
    path: 'beer-list',
    component: BeerListV2Component
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
export default appRoutes;

         Now, import this object inside app.module.ts and register the module.

// app.module.ts

import appRoutes from './routerConfig';

imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes)
],
*/

//probando
/*
const appRoutes: Routes = [
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

*/

// FIN =================================

@NgModule({
  declarations: [
    AppComponent,
    BeerEditComponent,
    BeerListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(appRoutes) 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
