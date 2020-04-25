# Spring Cloud Workshop

01-hello-controller: Spring-boot hello world application with swagger ui
02-actuator: Spring-boot actuator example with custm health indicator

### Hello Controller

```sh
$ mvn clean spring-boot:run
```
http://localhost:8080/hello

http://localhost:8080/customer/1

http://localhost:8080/swagger-ui.html

### Actuator
```sh
$ mvn clean spring-boot:run
```
http://localhost:8080/hello

http://localhost:8080/customer/1

http://localhost:8080/swagger-ui.html

http://localhost:8081/actuator

http://localhost:8081/actuator/metrics

http://localhost:8081/actuator/health -> for custom health indicator

