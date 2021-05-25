package io.github.theangelgang.util;

import java.util.Properties;

public class PropertiesManager {
    public static Properties properties;
    public static void loadProperties(Properties config) {
        properties = config;
    }

    /**
     * @return bot token from discord
     */
    public static String getToken() {
        return properties.getProperty("token");
    }
}
