//import { Component, OnInit } from '@angular/core';
import { Component, OnDestroy, OnInit } from '@angular/core';
//-------------------
//There is a lot of breaking changes with RxJS 6. 
// Type this to install it:
//             npm install -s rxjs-compat
import { Subscription } from 'rxjs/Subscription';

import { ActivatedRoute, Router } from '@angular/router';
import { NgForm } from '@angular/forms';

import { BeerService } from '../services/beer.service';
import { GiphyService } from '../services/giphy/giphy.service';


@Component({
  selector: 'app-beer-edit',
  templateUrl: './beer-edit.component.html',
  styleUrls: ['./beer-edit.component.css'],
    //Esto lo coloco por mi cuenta para proveer servicios
    providers: [BeerService, GiphyService]
})
//export class BeerEditComponent implements OnInit {
  export class BeerEditComponent implements OnInit, OnDestroy {

  beer: any = {};

  sub: Subscription;

  constructor(private route: ActivatedRoute,
              private router: Router,
              private beerService: BeerService,             
              private giphyService: GiphyService) {
  }

  ngOnInit() {
    this.sub = this.route.params.subscribe(params => {
      const id = params['id'];
      if (id) {
        this.beerService.get(id).subscribe((beer: any) => {
          if (beer) {
            this.beer = beer;
            this.beer.href = beer._links.self.href;
            this.giphyService.get(beer.name).subscribe(url => beer.giphyUrl = url);
          } else {
            console.log(`Beer with id '${id}' not found, returning to list`);
            this.gotoList();
          }
        });
      }
    });
  }

  ngOnDestroy() {
    this.sub.unsubscribe();
  }

  gotoList() {
    this.router.navigate(['/beer-list']);
  }

  save(form: NgForm) {
    this.beerService.save(form).subscribe(result => {
      this.gotoList();
    }, error => console.error(error));
  }

  remove(href) {
    this.beerService.remove(href).subscribe(result => {
      this.gotoList();
    }, error => console.error(error));
  }

}
