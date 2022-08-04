//

                     //0        1          2       3       4       5
const carreritas= ["Lucia", "Roberto","Maria","Jesus","Andrea","Jose"]; 
for(i=0;i<carreritas.length;i++){
    console.log(carreritas[i]);

}

carreritas.splice(2,0, 'Andrea');
carreritas.pop(5);
carreritas.splice(2,0, 'Cristobal');
carreritas.splice(3,0, 'Fernanda');
carreritas.splice(4,0, 'Armando');
carreritas.splice(0,0, 'Federico');


console.log("Clasificacion final: "+carreritas);