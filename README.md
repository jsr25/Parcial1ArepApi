# Parcial 1 Api

### Autor: Juan Sebastian Ramos Isaza

### Fecha: 19/02/2021

### Despliegue Heroku
[![Heroku](https://www.herokucdn.com/deploy/button.png)](https://parcial1arepapi.herokuapp.com/)


### Prerequisitos
Para la ejecución de la aplicación de manera local se necesitan los siguientes componentes:
* java 8 o superior
* maven
* git

### Instalacion
1. Se debe clonar el proyecto desde el Shell de su máquina con el comando :
    * git clone https://github.com/jsr25/Parcial1ArepApi.git
2. Moverse a la carpeta que se acaba de clonar:
    * cd Parcial1ArepApi
3. Se debe ejecutar un comando de Maven para comprobar el funcionamiento:
    * mvn package

### Ejecucion
* Maquinas con distribuciones de linux:
> java -cp target/classes:target/dependency/* edu.escuelaing.arep.servidorweb.ServidorWeb
* Maquina con windows
>java -cp target/classes;target/dependency/* edu.escuelaing.arep.servidorweb.ServidorWeb

Deben ejecutar esto en directorio del proyecto.

### Uso
Al abrir la url http://localhost:3478/calc?valor=5&opera=sin, esta url retornara un json con el resultado de la operacion 
si de sea probar con diferentes valores puede cambiar el parametro de la url valor por cualquier numero y opera por una de estas operaciones disponibles:
* sin (seno)
* cos (coseno)
* tan (tangente)

### Licencia

En este proyecto se usó la licencia GNU - se puede ver [LICENSE.txt](LICENSE.txt) para más detalles.