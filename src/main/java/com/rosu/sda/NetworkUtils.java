package com.rosu.sda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkUtils {
    public static final String STUDENT_URL = "https://online-school-catalog-ad.herokuapp.com/api/students";

    public static String getResponseFromURL() throws IOException {
        URL url = new URL(STUDENT_URL);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//        urlConnection.setRequestMethod("POST");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String responseLine = null;
        while ((responseLine = bufferedReader.readLine()) != null) {
            response.append(responseLine.trim());
        }
        System.out.println(response.toString());

        return response.toString();
    }
}
