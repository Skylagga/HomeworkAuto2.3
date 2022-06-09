package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {

    @Test
    public void shouldPostText() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("А что здесь происходит?")
                .when()
                .post("/post")
                .then()
                .statusCode(404)
                .body("data", equalTo("А что здесь происходит?"));
    }
}