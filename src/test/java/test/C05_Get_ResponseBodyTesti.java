package test;

import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class C05_Get_ResponseBodyTesti {
    /*
    https://jsonplaceholder.typicode.com/posts/44 url'ine bir GET request yolladigimizda
    donen Response’in
    status code'unun 200,
    ve content type'inin Aplication.JSON,charset=utf-8
    ve response body'sinde bulunan userId'nin 5,
    ve response body'sinde bulunan title'in "optio dolor molestias sit"
    oldugunu test edin.
     */

    @Test
    public void bodyTesti(){

        //1- endpoint hazirla
        String url="https://jsonplaceholder.typicode.com/posts/44";

        //2- soruda verilmisse expected body hazirlanir.

        //3-Donecek response kaydet.

        Response response=given().when().get(url);

       // response.prettyPrint();

        //4- Assertion islemi

        response.then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
               // .body("userId",Matchers.equalTo(5))
                .body("userId",equalTo(5))// mathcers silip import ediyoruz
                .body("title", equalTo("optio dolor molestias sit"));


    }
}
