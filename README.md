# CRUD-con-Spring-Boot-Hibernate

Este proyecto es una aplicación web CRUD (Crear, Leer, Actualizar, Eliminar) desarrollada con Spring Boot y Hibernate, siguiendo el Patrón de Arquitectura en Capas. La aplicación permite realizar operaciones básicas sobre una base de datos, gestionando entidades y relaciones a través de Hibernate.

## Tecnologías utilizadas
 -Java 11
 -Spring Boot
 -Hibernate
 -JPA (Java Persistence API)
 -MySQL
 -Maven
 -HTML/CSS para la interfaz de usuario básica
 -Arquitectura del proyecto
 
## El proyecto sigue el Patrón de Arquitectura en Capas:

-Model:Define las entidades del sistema, que representan las tablas de la base de datos.
-Repository : Se encarga de la comunicación directa con la base de datos utilizando Hibernate y JPA.
-Service : Contiene la lógica de negocio de la aplicación, interactuando con las capas de Repository y Controller.
-Controller:Gestiona las solicitudes HTTP y devuelve las respuestas adecuadas. Aquí se encuentran los endpoints que permiten interactuar con la aplicación.


## Implementación de operaciones CRUD:
  -Crear: Añadir nuevos registros a la base de datos.
  -Leer: Consultar los registros existentes.
  -Actualizar: Modificar los datos de los registros.
  -Eliminar: Eliminar registros específicos.
  
### Gestión de persistencia de datos con Hibernate y JPA.
### Uso de Spring Boot para gestionar dependencias y simplificar la configuración del proyecto.

## Pruebas
El correcto funcionamiento de la aplicación fue verificado utilizando Postman, lo que asegura que todos los endpoints respondan adecuadamente a las solicitudes HTTP (GET, POST, PUT, DELETE).
