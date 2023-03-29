package com.cydeo.day2;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.zaxxer.sparsebits.SparseBitSet.Statistics.Length;

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




    @DisplayName("get one spartan/api/spartans/3 and verify")
    @Test
    public void test2(){

     Response response= RestAssured.given().accept(ContentType.JSON).
                when().get(url+"/api/spartans/3");


        Assertions.assertEquals(response.statusCode(), 200);

        Assertions.assertEquals(response.contentType(), "application/json");

        Assertions.assertTrue(response.body().asString().contains("Fidole"));



    }



@ Test
    public void test3(){

      Response response = RestAssured.given(). get(url+ "/api/hello");

       Assertions.assertEquals(response.statusCode(), 200);

       Assertions.assertEquals(response.contentType(), "text/plain;charset=UTF-8");

        Assertions.assertTrue(response.headers().hasHeaderWithName("Date"));


    System.out.println("response.headers(\"Content-Length\")="+response.header("Content-Length"));
    System.out.println(response.header("Date"));



    Assertions.assertEquals(response.header("Content-Length"),"17");


    Assertions.assertEquals("Hello from Sparta",response.body().asString());

}










}
