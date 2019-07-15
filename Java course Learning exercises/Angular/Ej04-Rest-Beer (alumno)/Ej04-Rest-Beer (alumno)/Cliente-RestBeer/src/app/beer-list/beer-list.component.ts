import { Component, OnInit } from '@angular/core';

import { BeerService } from '../services/beer.service';
import { GiphyService } from '../services/giphy/giphy.service';

// NOTA
//    Todo lo de GiphyService es un añadido de un nuevo servicio
//    No sería necesario
@Component({
  selector: 'app-beer-list',
  templateUrl: './beer-list.component.html',
  styleUrls: ['./beer-list.component.css'],
  providers: [BeerService, GiphyService]  //necesitas añadir el servicio como un proveedor
})
export class BeerListComponent implements OnInit {
  beers: Array<any>;

  constructor(private beerService: BeerService, 
              private giphyService: GiphyService) { 

  }

  ngOnInit() {
    //Se implementa un patron Observer
    //El metodo getAll está definido en beer.service.ts
    this.beerService.getAll().subscribe(
      data => {
        this.beers = data;
        //Con lo anterior bastaría. 
        //   Ya se podrían ver las cervezas en el Front
        //   Si quiero añadir una iamgen a cada nombre uso un nuevo servicio
        //   Con este bucle añado una imagen a cada cerveza
        for (const beer of this.beers) {
          this.giphyService.get(beer.name).subscribe(url => beer.giphyUrl = url);
        }
      },
      error => console.log(error)
    )
  }
}
