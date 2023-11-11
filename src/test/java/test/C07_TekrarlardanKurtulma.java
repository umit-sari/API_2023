package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class C07_TekrarlardanKurtulma {
    /*
https://restful-booker.herokuapp.com/booking/10 url'ine
bir GET request gonderdigimizde donen Response'un,
        status code'unun 200,
        ve content type'inin application-json, ve response body'sindeki
        "firstname"in, "Susan",
        ve "lastname"in, "Jackson",
        ve "totalprice"in, 612,
        ve "depositpaid"in, false,
     ve "additionalneeds"in, "Breakfast" oldugunu test edin
 */

    @Test
    public void nonRepeat(){

        //1-end point hazirla

        String url="https://restful-booker.herokuapp.com/booking/10";

        //2-expected data verilmediği icin hazirlanmadi

        //3-Response kaydet

        Response response=given().when().get(url);

        //4- Assertion islemi

        response.then().assertThat().statusCode(200)
                .contentType("application/json")

                .body("firstname",equalTo("Mark"), // , kullanarak tekrar body yazmamis oluyoruz
                        "lastname", equalTo("Jones"),
                        "totalprice", equalTo(615),
                        "depositpaid", equalTo(true),
                        "additionalneeds", equalTo("Breakfast"));




    }
}
