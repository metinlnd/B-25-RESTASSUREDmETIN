package com.cydeo.day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpartansGetRequest {

    String url= "http://54.173.196.46:8000";

    @Test
    public void test1(){

        Response response   =RestAssured.given().accept(ContentType.JSON)
                .when().get(url+"/api/spartans");



        System.out.println(response.statusCode());


        System.out.println(response.contentType()+ "contenttype");


        response.prettyPrint();


      Assertions.assertEquals(response.contentType(),"application/json");

        Assertions.assertEquals(response.statusCode(),200);


    }



}
