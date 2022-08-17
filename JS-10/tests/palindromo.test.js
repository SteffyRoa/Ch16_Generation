const palindromo = require ('../src/js/palindromo');

describe ('Pruebas de la funcion palindromo', ()=> {
    test('debe regresar "Es un palindromo" si ingresamos ojo',() => {
        let mensaje = 'Es un palindromo';
        let palabra ='ojo';
        expect (palindromo(palabra) ).toBe(mensaje);

    })
    test('debe regresar "No es un palindromo" al ingresar generation',()=>{
        let mensaje ='No es un palindromo'
        let palabra = 'generation';
        expect (palindromo(palabra)).not.toBe(mensaje)
    } )
});


//pattern buscar un test o buscar un documento