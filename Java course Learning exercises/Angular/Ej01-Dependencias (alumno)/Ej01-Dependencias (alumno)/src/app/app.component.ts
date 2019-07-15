// app.component.ts

import { Component } from '@angular/core';
import { Computer } from './Computer';
import { Monitor } from './Monitor';
import { CPU } from './CPU';
import { Keyboard } from './Keyboard';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public computer: Computer;
  constructor() {
    this.computer = new Computer(new Monitor(), new CPU(), new Keyboard());
  }
  makeComputer() {
    return this.computer.complete();
  }
}
