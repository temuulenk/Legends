package main.java.net.temuulen.riot.api;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;

public class Method {

    protected String url;
    protected boolean requireKey = true;

    protected Type type;


    public Method(String url, Type type) {
        this.url = url;
        this.type = type;
    }


    public <T> T executeAndReturnDto() throws IOException {
        URL url = new URL(getURL());
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        return new Gson().fromJson(new InputStreamReader(connection.getInputStream()), type);
    }


    public String getURL() {
        return url;
    }

}
