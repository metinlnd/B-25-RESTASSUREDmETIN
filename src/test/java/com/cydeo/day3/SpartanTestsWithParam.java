package com.cydeo.day3;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class SpartanTestsWithParam {


    @BeforeAll
    public static void init(){

        baseURI="http://54.173.196.46:8000";


    }

@DisplayName("Get request to /api/spartants/{id} with ID 5")
    @Test
    public void test1(){


    RequestSpecification given = given();
    given.accept(ContentType.JSON);
    given.and();
    given.queryParam("id", "4");
    given.when();
    Response response=  given.get("/api/spartants/{id}");

    System.out.println(response.prettyPrint());

    // assertEquals(200, response.getStatusCode());
//assertEquals("application/json", response.contentType());

    //assertTrue(response.body().asString().contains("Blythe"));
  //  System.out.println(response.body().asString());


}





}
