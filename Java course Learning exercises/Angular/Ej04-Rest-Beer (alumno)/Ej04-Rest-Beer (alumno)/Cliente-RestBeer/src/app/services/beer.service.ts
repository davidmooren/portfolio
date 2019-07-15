import { Injectable } from '@angular/core';
// ---------------
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

@Injectable({
  providedIn: 'root'
})
export class BeerService {

  public API = '//localhost:8080';
  public BEER_API = this.API + '/beers';

  constructor(private http: HttpClient) {
  }

  // OBTENER
  // Método JPA Repository: Método  getOne(ID id)
  get(id: string) {
    return this.http.get(this.BEER_API + '/' + id);
  }

  // SALVAR
  // Método JPA Repository: Método saveAndFlush(S entity)
  save(beer: any): Observable<any> {
    let result: Observable<Object>;
    if (beer['href']) {
      result = this.http.put(beer.href, beer);
    } else {
      result = this.http.post(this.BEER_API, beer);
    }
    return result;
  }

  // EDITAR
  // Método JPA Repository: Método deleteInBatch(Iterable<T> entities)
  remove(href: string) {
    return this.http.delete(href);
  }

    // LISTADO
    getAll(): Observable<any> {
      return this.http.get(this.API + '/good-beers');
    }
}
