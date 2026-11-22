# Maven WAR Jenkins Practical

A small Java Servlet + JSP web application for practicing Maven, Jenkins Freestyle/Pipeline jobs, and deployment to Apache Tomcat 9.

## Requirements
- JDK 11 or later
- Apache Maven 3.6+
- Apache Tomcat 9

## Build locally
```bash
mvn clean package
```

The WAR file is generated at:

```
target/maven-war-jenkins-practical.war
```

## Deploy to Tomcat 9
Copy the WAR file into Tomcat's `webapps` directory and start/restart Tomcat.

Open:
- `http://localhost:8080/maven-war-jenkins-practical/`
- `http://localhost:8080/maven-war-jenkins-practical/hello`

## Jenkins
Repository URL:
```
https://github.com/anugulalokeshreddy-code/maven-war-jenkins-practical.git
```

Maven goals: `clean package`

Archive artifact: `target/*.war`

This project uses `javax.servlet`, compatible with Tomcat 9 (not Tomcat 10+).