

//primera forma

function saludar(){
    alert('Hola');
}
//todos los tipos de eventos empezaran con on


//mas comun y addEventListener()

const boton = document.getElementById('boton');
console.log(boton);

//solo acepta un valor se conoce como event-e
boton.addEventListener('click',(event)=>{
   // alert('hello')
   console.log(evento);
});

const formulario = document.getElementById('form');
formulario.addEventListener('submit',(e)=>{
    e.preventDefault();//no actualizar
    console.log(formulario[0].value);
})