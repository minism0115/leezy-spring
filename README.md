# leezy-spring
## 개발 환경
- Intellij IDEA 02022.2.2
- Java 11
- Gradle 7.5
- Spring Boot 2.6.12

## 기술 세부 스택
### Spring Boot
- Spring Web`spring-boot-starter-web`
- Spring Boot DevTools`spring-boot-devtools`
- Lombok`lombok`
- Spring Data JPA`spring-boot-starter-data-jpa`
    - H2 Database`com.h2database:h2`
    - MySQL Driver`com.oracle.database.jdbc:ojdbc8`
    - Oracle Driver`mysql:mysql-connector-java`
- Spring REST Docs`spring-restdocs-mockmvc`
- Rest Repositories`spring-boot-starter-data-rest`
- Rest Repositories HAL Explorer`spring-data-rest-hal-explorer`
- Spring Security`spring-boot-starter-security`
- Spring Configuration Processor`spring-boot-configuration-processor`
- Thymeleaf`spring-boot-starter-thymeleaf`

## Intellij에서 Java 11 설치
- File - Settings - Build, Execution, Deployment - Build Tools - Gradle
- Gradle projects - Gradle - Gradle JVM - Download JDK 선택
- Version: 11, Vendor: Amazon Corretto 선택 후 Download 버튼 클릭
- OK 버튼 클릭으로 적용

### 그외 
- QueryDSL 
- Bootstrap 5.2.0
- Heroku

## Spring Boot DevTools
### LiveReload 추가
- Chrome Extension

## Rest Repositories & HAL Explorer
### 설치
```
build.gradle 파일에 다음 라인 추가

dependencies {
  ...
    implementation 'org.springframework.boot:spring-boot-starter-data-rest'
    implementation 'org.springframework.data:spring-data-rest-hal-explorer'
  ...
}  
```
### HAL Explorer Page
http://localhost:8080/api

## Spring Security
### 설치
```
dependencies {
  ...
	implementation 'org.springframework.boot:spring-boot-starter-security'
	implementation 'org.thymeleaf.extras:thymeleaf-extras-springsecurity5'
  ...
}
```

## 실행환경 설정
### 로컬 PC에서 실행
Edit Configurations -> Build and run -> VM Option란에 '-Dspring.profiles.active=local' 이라고 적는다.
(https://adg0609.tistory.com/m/61)

# 선택 사항
## Swagger
### 설치
```
build.gradle 파일에 다음 라인 추가

dependencies {
  ...
  implementation 'org.springdoc:springdoc-openapi-ui:1.6.11'
  ...
}  
```
### Swagger Page
http://localhost:8080/swagger-ui/index.html
### 참고 사이트
https://springdoc.org/

## H2 Database
### 실치
```
build.gradle 파일에 다음 라인 추가

dependencies {
  ...
	runtimeOnly 'com.h2database:h2'
  ...
}  
```
### H2 Console Page
http://localhost:8080/h2-console

## Spring Configuration Processor
Generate metadata for developers to offer contextual help and "code completion" when working with custom configuration keys (ex.application.properties/.yml files).
### 설치
```
dependencies {
  ...
    annotationProcessor 'org.springframework.boot:spring-boot-configuration-processor'
  ...
}
```

## Heroku
### Heroku CLI 설치
- https://devcenter.heroku.com/articles/getting-started-with-java#set-up

### 데모 페이지
*  https://leezy-spring-app.herokuapp.com/
