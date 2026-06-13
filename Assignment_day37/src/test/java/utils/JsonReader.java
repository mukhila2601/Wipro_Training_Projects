package utils;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {

    public static LoginData getLoginData() throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        File file = new File("src/test/resources/loginData.json");

        LoginData data = mapper.readValue(file, LoginData.class);

        return data;
    }
}