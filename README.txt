Build

At present, the final artifact expected out of opengrok-app is a jar file. This jar file will contain compiled java code along with the js code which can be deployed on the embedded spring boot server

It is mandatory to build opengrok-config-UI before building opengrok-config-service. Not doing this will result in the final jar not having js code.

Steps to build:-
1. In opengrok-config-UI, execute "mvn clean generate-resources"
This is due to the fact that npm run build has been attached to generate-resources phase in this module's pom.

This should create dist folder under the opengrok-config-UI. Contents of dist folder will be copied in the next step before final jar is created.
2. In opengrok-config-service, execute "mvn clean validate package". Copying of resources(generated js files) from opengrok-config-UI will happen as part of validate phase of the build.

This step should create the final jar which should have compiled java classes as well as the js files copied from opengrok-config-UI/dist folder.

Deploy:-
Execute "mvn spring-boot:run" from opengrok-config-service directory

