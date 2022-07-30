##Dockerfile para projetos java SpringBoot com java 11
FROM openjdk:11-slim-buster

LABEL "author" = "Lucas Santos"
LABEL "email"="lucas.parkl@outlook.com"

## ambiente
ARG profile="Não passado"
ENV PROFILE_ENV=${profile}
LABEL "env"=${PROFILE_ENV}

COPY build/libs/*.jar app/app.jar
WORKDIR /app
ENTRYPOINT [ "java", "-Dspring.profiles.active=${PROFILE_ENV}", "-jar", "/app/app.jar"]
EXPOSE 5000

#para buildar execute docker build -t Nome_da_imagem .
#execute sudo docker run -e PROFILE_ENV=docker -e BOOTSTRAP_SERVER=ip bootstrap_server -p 5000:5000 -i ack-kafka-teste