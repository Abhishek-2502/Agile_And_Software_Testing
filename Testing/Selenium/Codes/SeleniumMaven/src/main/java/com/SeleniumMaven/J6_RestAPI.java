package com.SeleniumMaven;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class J6_RestAPI {

    @Test
    public void GetBooksDetails() {
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        // Get the RequestSpecification of the request to be sent to the server.
        RequestSpecification httpRequest = RestAssured.given();
        // specify the method type (GET) and the parameters if any.
        //In this case the request does not take any parameters
        Response response = httpRequest.request(Method.GET, "");
        // Print the status and message body of the response received from the server
        System.out.println("Status received => " + response.getStatusLine());
        System.out.println("Response=>" + response.prettyPrint());


        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://demoqa.com/Account/v1/User/";
        // Get the RequestSpecification of the request to be sent to the server
        RequestSpecification httpRequest1 = RestAssured.given();

        Response response1 = httpRequest1.request(Method.GET, "");
//        Response response1 = httpRequest1.get("test");

        // Get the status code of the request.
        //If request is successful, status code will be 200
        int statusCode = response1.getStatusCode();
        System.out.println("StatusCode: "+statusCode);

//        // Assert that correct status code is returned.
//        Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/,
//                "Correct status code returned");

        Assert.assertEquals(statusCode /*actual value*/, 401 /*expected value*/, "Correct status code returned");


    }
}