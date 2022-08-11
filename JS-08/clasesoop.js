class Persona {

    constructor(nombre,apellido){
    this.nombre=nombre;
    this.apellio = apellido;
}
get nombre(){
    return this._nombre;
}
set _nombre (nombre){
    this._nombre= nombre;
}
}

let persona1 = new Persona ('Jose', 'Perez');
console.log(persona1);

let persona2 = new Persona ('Karla', 'Ramirez');
console.log(persona2);
