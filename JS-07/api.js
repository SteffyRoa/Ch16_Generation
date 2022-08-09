

const urlAleatorios = "https://api.thecatapi.com/v1/images/search"
/*Elementos del DOM*/

const imagenGatito =document.getElementById("img-gatito");
const btn = document.getElementById("btn-gatito")

console.log(imagenGatito);

/*Eventos*/
btn.addEventListener("click", () => {
    console.log("Boton presionado");
    obtenerGatitoAleatorio(urlAleatorios)
    
})
    


/*agregar la funcionalidad*/

async function obtenerGatitoAleatorio(url){
    const respuesta = await fetch (url)
    const datos = await respuesta.json()

    console.log(datos);
    console.log(datos[0].id);
    console.log(datos.url);
  //  console.log(datos.status);

imagenGatito.src = datos[0].url
}

obtenerGatitoAleatorio(urlAleatorios)