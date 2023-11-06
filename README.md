# Spring-TP

Ce projet est une application Java qui utilise JDBC (Java Database Connectivity) pour interagir avec une base de données MariaDB. Il démontre l'implémentation d'un modèle DAO (Data Access Object) pour gérer l'accès aux données de la base de données.

## Configuration de la base de données

Pour configurer la connexion à la base de données, éditez le fichier `application.properties` situé dans le répertoire `src/main/resources`. Modifiez les informations suivantes pour correspondre à votre configuration de base de données :

```properties
# DataSource
spring.datasource.url=jdbc:mariadb://localhost:3307/bestioles
spring.datasource.username=root
spring.datasource.password=[password]

# Maria DB
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver

# Hibernate
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=validate 
```

L'application se connecte à la base de données **bestioles** avec **root** et un mot de passe.

On utilise MariaDB, donc le driver est `org.mariadb.jdbc.Driver`.

**Validate** : Hibernate vérifie que la table correspond au modèle. Si ce n'est pas le cas, il lève une exception.

## Structure du projet

- `enum` : contient les énumérations utilisées dans le projet.
- `model` : contient les classes de modèle.
- `repository` : contient les interfaces de repository.
