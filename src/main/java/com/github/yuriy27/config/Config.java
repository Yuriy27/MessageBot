package com.github.yuriy27.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {

    public static String MAIL;
    public static String PASSWORD;

    public static void load() {
        FileInputStream fis = null;
        Properties prop;
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            prop = new Properties();
            prop.load(fis);
            MAIL = prop.getProperty("mail");
            PASSWORD = prop.getProperty("password");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
