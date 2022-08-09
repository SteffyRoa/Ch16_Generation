

const urlAleatorios = "https://api.thecatapi.com/v1/images/search"
/*Elementos del DOM*/

const imagenPerrito =document.getElementById("img-perrito");

const btn = document.getElementById("btn-perrito")
console.log(btn)

/*Eventos*/
btn.addEventListener("click", () => {
    console.log("Boton presionado");
    obtenerPerritoAleatorio(urlAleatorios)
    
})

/*agregar la funcionalidad*/

async function obtenerPerritoAleatorio(url){
    const respuesta = await fetch (url)
    const datos = await respuesta.json()

    console.log(datos);
    console.log(datos.message);
  //  console.log(datos.status);

imagenPerrito.src = datos.message
}

//obtenerPerritoAleatorio(urlAleatorios)