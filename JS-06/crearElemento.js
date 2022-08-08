//Crear elementos

const imagen = document.createElement("img");
//modificar los atributos html del elemento
imagen.src=imagen.src = 'https://placeimg.com/200/200/animals';
imagen.alt='Imagenes aleatorias de animales';


//lo insertamos en un elemento padre
document.body.appendChild(imagen);
document.body.insertAdjacentElement("afterbegin",imagen);
document.body.insertAdjacentElement("afterend",imagen);
document.body.insertAdjacentElement("beforebegin",imagen);
document.body.insertAdjacentElement("beforeend",imagen);

//forma correcta de crear en insertar un elemento
//1- se crear el elemento que contendra la imagen
//2 - seleccionar el elemento padre
const padreImg = document.getElementById('padreImg');

//3crea elemento
const imagen2= document.createElement('img');

//4-modificamos los atributos del elememto
imagen2.src = 'https://placeimg.com/200/200/animals';
imagen2.alt = "Imagenes de naturaleza";

//5 insertar elemento
padreImg.appendChild(imagen2);

//utilizar forEach para pintar datos
const frutas =["Toronja","Manzana"];
const listafrutas = document.getElementById('frutas');

/*forma clasica numero 1
frutas.forEach((element)=> {
    const li = document.createEelement('li');
    li.textContext = elementlistaFrutas.appendChild(li);

});*/

//forma 2
frutas.forEach((el)=> {
    listafrutas.innerHTML =`<li>${el}</li>`;

});
