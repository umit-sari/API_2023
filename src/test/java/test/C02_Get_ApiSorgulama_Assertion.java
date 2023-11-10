package test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_Get_ApiSorgulama_Assertion {
    /*
    https://restful-booker.herokuapp.com/booking/1651 url'ine
    bir GET request
gonderdigimizde donen Response'un,
status code'unun 200,
ve content type'inin application/json; charset=utf-8,
ve Server isimli Header'in degerinin Cowboy,
ve status Line'in HTTP/1.1 200 OK
Assert ile dogrulayin
 */

    @Test
    public void getAssert() {

        String url="https://restful-booker.herokuapp.com/booking/46";

        Response response=given().when().get(url);

        response.then() // response'den cevap geldiginde
                .assertThat() // bunlari karsilastir
                .statusCode(200)
                .header("Server","Cowboy")
                .contentType("application/json; charset=utf-8")
                .statusLine("HTTP/1.1 200 OK");


    }
}
