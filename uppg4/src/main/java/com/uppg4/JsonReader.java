package com.uppg4;
import com.fasterxml.jackson.*;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class JsonReader {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("activities.json"));
        Date activityDate = jsonNode.get("startdate").asDate();
        TimeUnit activityTime = jsonNode.get("starttime").asTime();
        String columns = jsonNode.get("columns").asText();
        //String room = jsonNode.get("Lokal").asText();
        //String meetingLink = jsonNode.get("Möteslänk").asText();
        //String comment = jsonNode.get("Kommentar").asText();
        //String country = jsonNode.get("country").asText();
        System.out.println(columns);
        System.out.println(activityDate);
        System.out.println(activityTime);
    }
}
