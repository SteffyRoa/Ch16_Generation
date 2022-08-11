let x = 10;
console.log(x.length);

let persona = {
    nombre:'Juan',
    apellido:'Fernandez',
    edad:23,
    email: 'usuario@servidor.com',
    nombreCompleto: function () {
        return this.nombre + ' '+this.apellido;
    }
}

console.log(persona.nombre);
console.log(persona.nombreCompleto());

let newPersonas = new Object ();

newPersonas.nombre ="Luis"
newPersonas.apellido="Santoyo"
newPersonas.correo = "luis@gmail.com"
newPersonas.edad = 25

console.log(newPersonas);

persona.tel ='555555'
persona.tel = '87492345'
console.log(persona);