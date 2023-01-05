[FR] Dans ce projet, je fais une démonstration de
l'implémentation de Spring Security avec 
Spring Boot 3.0 et Java 17.
Ce projet contient d'abord l'enregistrement et la connexion de l'utilisateur avec
l'authentification basée sur JWT, puis le Cryptage du mot de passe à l'aide de BCrypt.
. Ensuite, l'autorisation basée sur les rôles avec
Spring Security. Enfin, la gestion personnalisée des refus d'accès.
----------------------------------------------------------------------------------------
[EN] In this project, I am demoing Spring Security 
implementation with Spring Boot 3.0 and Java 17. 
This project contains user registration and login 
first with JWT based authentication, 
then Encryption password using BCrypt. 
Next, role-based authorization with Spring Security.
Finally, personalized management of access denials.
------------------------------------------------------------------------------------------
git clone
mvn clean install
mvn spring-boot:run

----------------------------------------------------
POST METHODS on  http://localhost:8181/api/v1/auth/register
JSON REGISTER
{
"firstname": "Brody",
"lastname": "Mounanga",
"email":"brody@spring.io",
"password": "12345678"
}
----------------------------------------------------
POSTE METHODS on http://localhost:8181/api/v1/auth/authenticate

JSON AUTHENTICATE
{
"email":"brody@spring.io",
"password": "12345678"
}
----------------------------------------------------------------------------
Java 17
Spring Boot 3.1
JWT
Bcrypt
Maven 3+
