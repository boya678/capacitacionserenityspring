postgres database

to run in docker

docker run -p 5432:5432 -e POSTGRES_PASSWORD=1234 postgres

so your conection string must be

spring.datasource.url=jdbc:postgresql://localhost:5432/capacitacion
spring.datasource.username=postgres
spring.datasource.password=1234

edit src/resources/configuration.properties with your database url, user and pass

use DBeaver

for run create table persona and database capacitacion

fields

id int8
nombre varchar
apellido varchar
direccion varchar
telefono varchar

to run in docker

docker run -p 5432:5432 -e POSTGRES_PASSWORD=1234 postgres

so your conection string must be

spring.datasource.url=jdbc:postgresql://localhost:5432/capacitacion
spring.datasource.username=postgres
spring.datasource.password=1234

run with

mvn verify

gradlew test
