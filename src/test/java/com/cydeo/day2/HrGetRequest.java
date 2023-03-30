package com.cydeo.day2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.util.Asserts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class HrGetRequest {

    @BeforeAll
    public static void init() {

        RestAssured.baseURI= "http://54.173.196.46:1000/ords/hr";


    }


    @DisplayName("Get request to/regions")
    @Test
    public void test1(){

        Response response = RestAssured.get("/regions");
        System.out.println(response.statusCode());


    }


@DisplayName("Get request to/regions")
    @Test
    public void test2(){

        Response response = RestAssured.get("/regions/2");
    Assertions.assertEquals(200, response.statusCode());
    Assertions.assertEquals("application/json", response.contentType());
    response.prettyPrint();

}







}
