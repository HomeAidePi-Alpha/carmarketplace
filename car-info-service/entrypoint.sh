#!/bin/sh

while ! nc -z car-info-service-db 1433; do
    echo "Waiting for the DB Server"
    sleep 3
done

java -jar car-info-service.jar