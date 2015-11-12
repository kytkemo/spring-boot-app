spring-boot-app
===============

Maven archetype for a Spring Boot app (Java 8 + Spring Boot 1.2.7.RELEASE).

## Install

Install the archetype to your local Maven repository with `mvn clean install`.

## Usage

Create projects from the archetype.

    mvn archetype:generate -DarchetypeGroupId=com.kytkemo
                           -DarchetypeArtifactId=spring-boot-app
                           -DarchetypeVersion=1.0.3
                           -DgroupId=com.yourcompany
                           -DartifactId=ProjectName
                           -Dpackage=com.yourcompany.projectname

## Developing a Project

After creating a project from the archetype you can do the following tasks.

### Run App

Run app with `mvn spring-boot:run`.

### Run Tests

Run tests with `mvn test`.

### Build

Create a package with `mvn package`.
