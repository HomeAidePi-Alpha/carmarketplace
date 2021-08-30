#Build stage
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
COPY ../pom.xml /home
RUN mvn -f /home/pom.xml clean install
RUN mvn -f /home/app/pom.xml clean package

FROM adoptopenjdk/openjdk11
LABEL maintainer="geekymon2@gmail.com"
COPY --from=build /home/app/target/car-info-service*.jar car-info-service.jar
RUN apt-get update && apt-get install -y netcat
COPY entrypoint.sh ./entrypoint.sh
RUN chmod +x ./entrypoint.sh
EXPOSE 8080
ENTRYPOINT ["./entrypoint.sh"]