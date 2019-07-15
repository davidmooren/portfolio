 /**
 * generate a random integer between min and max
 * @param {Number} min 
 * @param {Number} max
 * @return {Number} random generated integer 
 */
    //https://www.typescriptlang.org/docs/handbook/functions.html

    /*
    Para incluir funciones
    https://stackoverflow.com/questions/49526681/how-to-call-javascript-functions-from-typescript-in-angular-5
    Paso 1 - escribir en fichero
    Paso 2 - angular.cli.json
       "script": [
           "assets/js/simulation.js"
       ],
    Paso 3 - Llamarla previa declaracion en el TS
            Declaro metodos en archivo JS
                 declare function randomInt(p1:any,p2:any):any 
    */

    /* NO FUNCA al colocarlo */
    function randomInt(min, max){
        return Math.floor(Math.random() * (max - min + 1)) + min;
    }
