package utility;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.testng.Assert;

import java.io.IOException;

public class ApiUtil {

    DefaultHttpClient httpClient = new DefaultHttpClient();

    public HttpResponse onGET(String uri) throws IOException {
        HttpGet getRequest = new HttpGet(uri);
        getRequest.addHeader("accept", "application/json");
        HttpResponse response = httpClient.execute(getRequest);
        return response;
    }

    public boolean compareTwoJSON(String s1, String s2){
        boolean msg ;
        JsonParser parser = new JsonParser();
        if(parser.parse(s1).equals(parser.parse(s2))){
            msg = true;
        }else{
            msg = false;
        }
        return msg;
    }


}
