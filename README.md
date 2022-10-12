# leezy-spring

## Maven Libraries
### 기본
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
- Spring Security'

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