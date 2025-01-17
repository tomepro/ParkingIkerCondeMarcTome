# ParkingIkerCondeMarcTome
Este proyecto constituye un sistema de gestión para un aparcamiento automatizado, orientado a organizar y controlar el uso de plazas de aparcamiento, crear tickets para los vehículos y calcular el importe correspondiente. El sistema contará con las siguientes clases principales: 
 
Parking: 
Es la clase que gestiona el aparcamiento. Contiene información como el número de plantas, las plazas que hay por planta, las tarifas establecidas para diferentes tipos de vehículos, proporciona métodos para: 
-Asignar una plaza a un vehículo. 
-Liberar una plaza cuando un vehículo se marcha. 
-Calcular el importe a abonar en función del tipo de vehículo y del tiempo que ha ido aparcado. 
-Mostrar las plazas disponibles para nuevos vehículos. 
 
Ticket: 
Define el recibo de entrada que se genera al acceder al parking. Contiene información como la dirección del parking, el teléfono de la empresa, el identificador del vehículo, la fecha y la hora de entrada; se genera mediante el método crearTicket(). 


 
Plaza:
Define cada una de las plazas de aparcamiento que hay en el parking. Las plazas de aparcamiento se pueden adaptar a cada tipo de vehículo, como camiones, motos o coches; permite: 
- Reservar una plaza de aparcamiento, cuando un vehículo llega. 
-Liberar una plaza de aparcamiento de modo que se vuelva a poder usar. 
 
Identificador: 
Representa la información concreta de un vehículo, como el tipo de vehículo (camión, moto, coche), matrícula y color. Almacena las tarifas aplicables a cada tipo de vehículo, que son utilizadas para calcular el importe por aparcar. 
 
Así, el sistema funciona a partir de la asignación de plazas de aparcamiento disponibles a los vehículos una vez accedidos al parking, almacenando su información en un Ticket. Una vez que el vehículo sale, se libera la plaza y se calcula el importe correspondiente a las tarifas y al tiempo que ha estado aparcando.

