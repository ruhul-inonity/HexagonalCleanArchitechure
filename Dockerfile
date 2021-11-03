FROM openjdk:11

WORKDIR /app

COPY ./out/artifacts/JustPay_jar/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
