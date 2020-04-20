
$prod1=Read-Host ‘Introduzca el primer producto’
$prod2=Read-Host ‘Introduzca el segundo producto’
$prod3=Read-Host ‘Introduzca el tercer producto’
$prod4=Read-Host ‘Introduzca el cuarto producto’

$urlsp='https://trends.google.es/trends/explore?geo=ES&q='+$prod1+','+$prod2+','+$prod3+','+$prod4
Start-Process chrome $urlsp

$prod11=Read-Host ‘¿Hay más del 50% de búsquedas en el primer producto?’
$prod12=Read-Host ‘¿Hay más del 50% de búsquedas en el segundo producto?’
$prod13=Read-Host ‘¿Hay más del 50% de búsquedas en el tercer producto?’
$prod14=Read-Host ‘¿Hay más del 50% de búsquedas en el cuarto producto?’

if($prod11=1){
'El producto:' +$prod1 +' es rentable'
}else{
'El producto:' +$prod1 +' no es rentable'
}

if($prod12=1){
'El producto:' +$prod2 +' es rentable'
}else{
'El producto:' +$prod2 +' no es rentable'
}

if($prod13=1){
'El producto:' +$prod3 +' es rentable'
}else{
'El producto:' +$prod3 +' no es rentable'
}


if($prod14=1){
'El producto:' +$prod4 +' es rentable'
}else{
'El producto:' +$prod4 +' no es rentable'
}
