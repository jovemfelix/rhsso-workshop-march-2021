# keycloak-springboot-microservice

Example exploring Spring Boot 2.3.x with RH-SSO 7.4



> Please refer Medium article for more details: 
> https://medium.com/@ddezoysa/securing-spring-boot-rest-apis-with-keycloak-1d760b2004e



## RH-SSO 7.4.x (or Keycloak 9.x)

```shell
# start it at port 8180
# at the home path
./bin/standalone.sh -Djboss.socket.binding.port-offset=100
```

# Scenery - Java Configuration-based security

That is, *java or spring* programming **is used**, <u>not</u> file *configuration* (either `application.properties` or `application.yaml`)

> So is required the [KeycloakSecurityConfig.java](src/main/java/com/dinuth/keycloakspringbootmicroservice/config/KeycloakSecurityConfig.java) and not required to have `@RolesAllowed` annotation at [TestController.java](src/main/java/com/dinuth/keycloakspringbootmicroservice/controller/TestController.java)

## Running

```shell
# with the KEYCLOAK_ENABLED variable you can enable ou disable the security
KEYCLOAK_ENABLED=true && mvn clean spring-boot:run
```

## Postman

To load configuration and test using [PostMan](https://www.postman.com/) look at folder `postman` and import the `JSON` files

## Configuration

With Spring you can use nether [yaml](src/main/resources/application.yaml) or [properties](src/main/resources/--application.properties), we choose the <u>first</u>.

# Reference

* [Secured example application for Spring Boot - Official Documentation](https://access.redhat.com/documentation/en-us/red_hat_support_for_spring_boot/2.3/html-single/spring_boot_runtime_guide/index#example-rest-http-secured-spring-boot)
* [Spring Boot Adapter - Official Documentation](https://access.redhat.com/documentation/en-us/red_hat_single_sign-on/7.4/html-single/securing_applications_and_services_guide/index#spring_boot_adapter)
* [Maven POM Order](https://maven.apache.org/pom.html)

