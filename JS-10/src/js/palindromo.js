


const palindromo = (palabra) =>{
    let palabraInvertida = palabra.split("").reverse().join("");

    return (palabra == palabraInvertida) ? 'Es un palindromo' : 'No es un palindromo';


}


//condicion ? verdadera : falsa
//condicion ? if : else

console.log(palindromo(1))

module.exports = palindromo;