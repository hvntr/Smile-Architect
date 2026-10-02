FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# 2. 소스 코드 복사 및 빌드 (테스트 스킵)
COPY . .
RUN apt-get update && apt-get install -y dos2unix && \
    dos2unix ./mvnw && \
    chmod +x ./mvnw && \
    sh ./mvnw clean package -DskipTests

# 3. 경량화된 Java 17 실행 환경으로 JAR 파일 복사 후 실행
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]