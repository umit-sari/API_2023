package test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiSorgulama {
    /*
C1_Get_ApiSorgulama
https://restful-booker.herokuapp.com/booking/46 url'ine bir GET request
gonderdigimizde donen Response'un,
status code'unun 200,
ve content type'inin application/json;
charset=utf-8, ve Server isimli Header'in degerinin Cowboy,
ve status Line'in HTTP/1.1 200 OK
ve response suresinin 5 sn'den kisa oldugunu
manuel olarak test ediniz.
 */

// 1-url belirleyip url adresine gideceğiz
// 2-expected data verilmişse expected data hazırlanır
// 3-Actual data alınacak
// 4-assertion işlemi

@Test
public void get01(){
    // 1-url belirleyip url adresine gideceğiz

    String url="https://restful-booker.herokuapp.com/booking/46"; // bazen id siliniyor not found uyari sebebi.

    // 2-expected data verilmişse expected data hazırlanır.
    //acikca verilirse hazirlanir.

    // 3-Actual data alınacak

    Response response=given().when().get(url);

   // response.prettyPrint(); sistemi yorar  yoruma aliyoruz

    System.out.println("status code :"+response.statusCode()); //200

    System.out.println("content type :"+response.contentType()); //application/json

    System.out.println("status line :"+response.statusLine()); //HTTP/1.1 200 OK

    System.out.println("Server header degeri :"+response.getHeader("Server"));//Cowboy

    System.out.println("time :"+response.getTime());//1945 milisaniye

    //soru da manuel ile kontrol edin dedigi icin Assert ile kontrol etmedik.

    }
}
