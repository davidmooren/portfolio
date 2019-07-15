import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

//Exporto la clase
//creo los atributos. En este caso un H1
export class AppComponent {
  title = 'BeerListClient (SpringBoot + Rest + Angular)';
}
