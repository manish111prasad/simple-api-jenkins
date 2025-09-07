# simple-api-jenkins

Minimal Spring Boot REST API + Jenkinsfile.

## Run locally

```bash
# In the project root:
mvn clean package
java -jar target/simple-api-jenkins-0.0.1-SNAPSHOT.jar
```

Endpoints:
- GET http://localhost:8080/api/hello
- GET http://localhost:8080/api/health

## Jenkins setup (Pipeline)

1. Manage Jenkins ▸ Tools: add **JDK 17** as `jdk-17` and **Maven** as `Maven`.
2. Create a **Pipeline** job pointing to your repo and set Script Path to `Jenkinsfile`.
3. The pipeline stages will: Checkout → Build & Test → Publish JUnit → Archive JAR.

## Notes
- Requires Java 17+.
- Uses Spring Boot 3.3.x.
