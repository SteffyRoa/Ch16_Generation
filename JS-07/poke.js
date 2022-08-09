const url ="https://pokeapi.co/api/v2/pokemon/ditto";

/*Funciones*/
async function obtenerPokemos (url){
    const respuesta = await fetch(url)
    const datos = await respuesta.json()

    console.log(datos);
    console.log(datos.forms[0].name);

   /* const pokemon ={
        nombre:datos.forms[0].name,
        habilidad:datos.abilities,
        numero:datos.id
        tipo:datos.types,
        imagen: datos.sprites.other["official-artwork"].front_default

    }*/
    console.log(pokemon.habilidades);
}
obtenerPokemon(urlPokemon)