# Car Marketplace

Microservices App for Car Marketplace

## Status

**apigateway** <br/>
[![build](https://github.com/homeaidepi/carmarketplace-apigateway/actions/workflows/build.yml/badge.svg)](https://github.com/homeaidepi/carmarketplace-apigateway/actions/workflows/build.yml) &nbsp;&nbsp; [![codecov](https://codecov.io/gh/homeaidepi/carmarketplace-apigateway/branch/main/graph/badge.svg?token=XTL0XCZ4JI)](https://codecov.io/gh/homeaidepi/carmarketplace-apigateway) &nbsp;&nbsp; ![Docker Image Version (latest by date)](https://img.shields.io/docker/v/homeaidepi/cm-apigateway) &nbsp;&nbsp; ![Docker Image Size (latest by date)](https://img.shields.io/docker/image-size/homeaidepi/cm-apigateway)

**car-info-service** <br/>
[![build](https://github.com/homeaidepi/carmarketplace-car-info-svc/actions/workflows/build.yml/badge.svg)](https://github.com/homeaidepi/carmarketplace-car-info-svc/actions/workflows/build.yml) &nbsp;&nbsp; [![codecov](https://codecov.io/gh/homeaidepi/carmarketplace-car-info-svc/branch/main/graph/badge.svg?token=LH7ATDIHTB)](https://codecov.io/gh/homeaidepi/carmarketplace-car-info-svc) &nbsp;&nbsp; ![Docker Image Version (latest by date)](https://img.shields.io/docker/v/homeaidepi/cm-car-info-svc) &nbsp;&nbsp; ![Docker Image Size (latest by date)](https://img.shields.io/docker/image-size/homeaidepi/cm-car-info-svc)

**car-listing-service** <br/>
[![build](https://github.com/homeaidepi/carmarketplace-car-listing-svc/actions/workflows/build.yml/badge.svg)](https://github.com/homeaidepi/carmarketplace-car-listing-svc/actions/workflows/build.yml) &nbsp;&nbsp; [![codecov](https://codecov.io/gh/homeaidepi/carmarketplace-car-listing-svc/branch/main/graph/badge.svg?token=LH7ATDIHTB)](https://codecov.io/gh/homeaidepi/carmarketplace-car-listing-svc) &nbsp;&nbsp; ![Docker Image Version (latest by date)](https://img.shields.io/docker/v/homeaidepi/cm-car-listing-svc) &nbsp;&nbsp; ![Docker Image Size (latest by date)](https://img.shields.io/docker/image-size/homeaidepi/cm-car-listing-svc)

**user-service** <br/>
[![build](https://github.com/homeaidepi/carmarketplace-user-svc/actions/workflows/build.yml/badge.svg)](https://github.com/homeaidepi/carmarketplace-user-svc/actions/workflows/build.yml) &nbsp;&nbsp; [![codecov](https://codecov.io/gh/homeaidepi/carmarketplace-user-svc/branch/main/graph/badge.svg?token=LH7ATDIHTB)](https://codecov.io/gh/homeaidepi/carmarketplace-user-svc) &nbsp;&nbsp; ![Docker Image Version (latest by date)](https://img.shields.io/docker/v/homeaidepi/cm-user-svc) &nbsp;&nbsp; ![Docker Image Size (latest by date)](https://img.shields.io/docker/image-size/homeaidepi/cm-user-svc)

**discovery-server** <br/>
[![build](https://github.com/homeaidepi/carmarketplace-discovery-server/actions/workflows/build.yml/badge.svg)](https://github.com/homeaidepi/carmarketplace-discovery-server/actions/workflows/build.yml) &nbsp;&nbsp; [![codecov](https://codecov.io/gh/homeaidepi/carmarketplace-discovery-server/branch/main/graph/badge.svg?token=LH7ATDIHTB)](https://codecov.io/gh/homeaidepi/carmarketplace-discovery-server) &nbsp;&nbsp; ![Docker Image Version (latest by date)](https://img.shields.io/docker/v/homeaidepi/cm-discovery-server) &nbsp;&nbsp; ![Docker Image Size (latest by date)](https://img.shields.io/docker/image-size/homeaidepi/cm-discovery-server)

**config-server** <br/>
[![build](https://github.com/homeaidepi/carmarketplace-config-server/actions/workflows/build.yml/badge.svg)](https://github.com/homeaidepi/carmarketplace-config-server/actions/workflows/build.yml) &nbsp;&nbsp; [![codecov](https://codecov.io/gh/homeaidepi/carmarketplace-config-server/branch/main/graph/badge.svg?token=LH7ATDIHTB)](https://codecov.io/gh/homeaidepi/carmarketplace-config-server) &nbsp;&nbsp; ![Docker Image Version (latest by date)](https://img.shields.io/docker/v/homeaidepi/cm-config-server) &nbsp;&nbsp; ![Docker Image Size (latest by date)](https://img.shields.io/docker/image-size/homeaidepi/cm-config-server)


## Related Git Repos

* [carmarketplace-apigateway](https://github.com/homeaidepi/carmarketplace-apigateway) - Api Gateway
* [carmarketplace-car-info-svc](https://github.com/homeaidepi/carmarketplace-car-info-svc) - Car Info Services
* [carmarketplace-car-listing-svc](https://github.com/homeaidepi/carmarketplace-car-listing-svc) - Car Listing Service
* [carmarketplace-user-svc](https://github.com/homeaidepi/carmarketplace-user-svc) - User Service
* [carmarketplace-imgstore-svc](https://github.com/homeaidepi/carmarketplace-imagestore-svc) - Image Store Service
* [carmarketplace-config-server](https://github.com/homeaidepi/carmarketplace-config-server) - Config Server
* [carmarketplace-discovery-server](https://github.com/homeaidepi/carmarketplace-discovery-server) - Discovery Server
* [carmarketplace-config](https://github.com/homeaidepi/carmarketplace-config) - Configuration

## DockerHub Images
* https://hub.docker.com/repository/docker/homeaidepi/cm-apigateway
* https://hub.docker.com/repository/docker/homeaidepi/cm-car-info-svc
* https://hub.docker.com/repository/docker/homeaidepi/cm-car-listing-svc
* https://hub.docker.com/repository/docker/homeaidepi/cm-user-svc
* https://hub.docker.com/repository/docker/homeaidepi/cm-imgstore-svc
* https://hub.docker.com/repository/docker/homeaidepi/cm-config-server
* https://hub.docker.com/repository/docker/homeaidepi/cm-discovery-server

## Technologies Used
* Spring Boot
* Spring Cloud Config
* Netflix Discovery
* Spring Cloud Gateway
* JUnit 5
* SpringFox Swagger2
* Model Mapper
* Java 11
* Lombok
* Jacoco Code Coverage
* Docker
* Docker Compose
* Maven
* Spring JPA
* H2 database
* MySQL

## Features
* H2 database for running in test profile for execution of integration testing
* JUnit 5 for unit and integration testing
* Netflix Discovery service for automatic service discovery
* Spring Cloud Config Server for centralised config
* Swagger is included in all services
* Aggregated Swagger Documentation

## Architecture
TODO

## Environment Build
* Builds are automated via GitHub Actions
* For each service build scripts are present in .github/workflows/build.yml
* Build process
  * checkout -> build -> test -> codecov -> docker image -> upload to dockerhub

## Environment Deployment
* TODO

## Local Build
* Local Environment Requirements
  * Install and ensure MySQL database IS running.
  * Check application.yml for connection properties
  * Create DB Schemas for Services that need datastore.
  * 
  
* Local Build Steps
- First build the parent pom. This is needed before others can be built.
  * mvn -f pom.xml install -N
- Build again to also build the core module. Core module is a dependency across other services.
  * mvn -f pom.xml install
- Now you can go and build all services under carmarketplace repos.

## Local Development
