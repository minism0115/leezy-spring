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
