package utils;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {

    public static String[] getLoginData() throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("src/test/resources/loginData.csv"));

        br.readLine();

        String line = br.readLine();

        String[] data = line.split(",");

        br.close();

        return data;
    }
}