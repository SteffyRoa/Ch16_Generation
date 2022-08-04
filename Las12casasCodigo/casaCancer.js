//Crea una calculadora para convertir un valor ingresado por el usuario a 
//grados Celsius, Fahrenheit y Kelvin.
//Solicitar el valor por medio de prompt
//Crear funciones para realizar los calculos 
//Mostrar lo resultados mediantes alertas
let dato = prompt('Ingresa tu valor en celsius');
let kel=273.15;

let Fahrenheit  = (dato) * (1.8) + 32;
console.log("Fahrenheit: "+Fahrenheit );

let Kelvin = dato+kel;
console.log("Kelvin: "+Kelvin);

