a
//va dentro un id
console.log(document.getElementById('parrafo1').textContent);
//se guarda el documento en parrafo1
const parrafo1 = document.getElementById('parrafo1');
const parrafo3 = document.getElementById('parrafo3');
parrafo1.textContent ="Hola desde el parrafo1";

console.log(parrafo1.textContent);

parrafo1.style.color ='red';
parrafo1.style.background ="yellow";


//seleccionar varios elementos al mismo tiempo
const parrafo2 = document.querySelector('parrafo');
console.log(parrafo2.textContent)


//querySelectorALL()
//regresa lista de nodos

const parrafos = document.querySelectorAll('p');
console.log(parrafos.length)

parrafos[2].style.fontSize = "2rem";

parrafos[3].style.fontFamily="Arial Black";
parrafos[3].style.accentColor;

//Modificar los atributos de html
const enlace = document.getElementById('enlace')
console.log(enlace.href);
enlace.href='https://www.youtube.com';
enlace.target= "_blank";
enlace.textContent ='Enlace de Youtube';

/*Remplazar contenido*/
const parrafo4 = document.getEelementById('parrafo4');
console.log(parrafo4.nodeName);
console.log(parrafo4.textContent);
console.log(parrafo4.innerHTML);//muestra
//html que haya en el interior de el elemento
console.log(parrafo4.outerHTML);//muestra el contenido html, incluyendo el html

<a href="google.com">Enlace</a>
//parrafo.outerHTML = '<a href= "hhtp://google.com>Enlace</a> reemplaza el elemento completo"

//parrafo4.innerHTML = '<a href="http://google.com"></a> reemplaza el contenido dele elemento


parrafo4.innerHTML ='<div class="elemento">Este es un div</div>';

//JS nos permite modificar las clases css
//Una forma es utilizar style, un atributo que nos provee el DOM

//utilicando style
//usando classList
console.log(parrafo4.classList.contains("elemento"));

const cambiarColor = () => {
    parrafo4.classList.toggle('elemento'); 
}
cambiarColor();//se agrega la clase
cambiarColor();//se quita la clase
