##Dockerfile para projetos java SpringBoot com java 11
FROM openjdk:11-slim-buster

LABEL "author" = "Lucas Santos"
LABEL "email"="lucas.parkl@outlook.com"

## ambiente
ARG profile="Não passado"
ENV env=${profile}
LABEL "env"=${env}

COPY build/libs/*.jar app/app.jar
WORKDIR /app
ENTRYPOINT [ "java", "-Dspring.profiles.active=${env}", "-jar", "/app/app.jar"]
EXPOSE 5000