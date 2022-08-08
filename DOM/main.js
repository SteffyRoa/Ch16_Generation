
//va dentro un id
console.log(document.getElementById('parrafo1').textContent);
//se guarda el documento en parrafo1
const parrafo1 = document.getElementById('parrafo1');

parrafo1.textContent ="Hola desde el parrafo1";

console.log(parrafo1.textContent);

parrafo1.style.color ='red';
parrafo1.style.background ="yellow";