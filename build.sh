#!/bin/bash

cd "${0%/*}"
echo "$PWD"

mvn clean generate-resources -f opengrok-config-UI/pom.xml && mvn clean validate package -f opengrok-config-service/pom.xml && mvn spring-boot:run -f opengrok-config-service/pom.xml
