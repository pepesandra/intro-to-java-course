package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        try {
    URL myURL = new URI ("https://www.cbfacademy.com/"). toURL();
    HttpURLConnection connection = (HttpURLConnection) myURL.openConnection();
connection.setRequestMethod("GET");
        
         try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            connection.disconnect();
        }

    } catch (Exception e) {
        System.out.println(e.getMessage());

    }
    }
    }
