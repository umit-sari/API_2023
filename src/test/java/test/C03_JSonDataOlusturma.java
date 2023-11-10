package test;

import org.json.JSONObject;
import org.junit.Test;

public class C03_JSonDataOlusturma {
    /*
Asagidaki JSON Objesini olusturup konsolda yazdirin.
{
    "title":"Ahmet",
    "body":"Merhaba",
    "userId":1
}
 */

    @Test
    public void jsonData(){

        JSONObject jsonData=new JSONObject();

        jsonData.put("title","Ahmet");

        jsonData.put("body","Merhaba");

        jsonData.put("userId",1);

        System.out.println("ilk olusturdugumuz json data :"+jsonData);

    }

    @Test
    public void innerJson(){
        /*
Asagidaki JSON Objesini olusturup konsolda yazdirin.

{
"firstname":"Jim",
 "additionalneeds":"Breakfast",
 "bookingdates":{
                "checkin":"2018-01-01",
                "checkout":"2019-01-01"
                },
"totalprice":111,
"depositpaid":true,
 "lastname":"Brown"
}
 */

        // ic ice Json datalarin once en icteki datayi ekleyerek basliyoruz. En icten en disa dogru geliyoruz.
    JSONObject innerJson=new JSONObject();

    innerJson.put("checkin","2018-01-01");

    innerJson.put("checkout","2019-01-01");


    // sonra bir sonraki data icin tekrar Json obje atamasi yapiyoruz
        JSONObject jsonData=new JSONObject();

        jsonData.put("firstname","Jim");
        jsonData.put("additionalneeds","Breakfast");
        jsonData.put("bookingdates",innerJson); // icerdeki datayi buraya yaziyoruz
        jsonData.put("totalprice",111);
        jsonData.put("depositpaid","true");
        jsonData.put("lastname","Brown");

        System.out.println(jsonData);




    }


}
