package org.example;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.client.utils.URIBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            String projectId = "23791548";

            URIBuilder uriBuilder = new URIBuilder("https://gitlab.com/api/v4/projects/" + projectId);
            URL url = uriBuilder.build().to

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                String jsonResponse = response.toString();
                JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();

                String projectDescription = jsonObject.get("name").getAsString();
                System.out.println("Nom du projet : " + projectDescription);
            } else {
                System.err.println(responseCode);
            }
            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}