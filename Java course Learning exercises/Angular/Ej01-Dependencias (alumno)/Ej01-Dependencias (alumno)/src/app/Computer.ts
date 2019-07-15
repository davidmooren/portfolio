import { Monitor } from './Monitor';
import { CPU } from './CPU';
import { Keyboard } from './Keyboard';

export class Computer {
  public description = 'This Matrix computer';

  //Aqui se crean tres instancias en el constructor
  //Por lo tanto no está desacoplado
  constructor(public monitor: Monitor, public cpu: CPU, public keyboard: Keyboard) {}

  complete() {
    return `${this.description} has ` +
      `${this.monitor.monitorNo} monitors, ${this.cpu.cpuNo} cpus, and ${this.keyboard.keyboardNo} keyboard.`;
  }
}
