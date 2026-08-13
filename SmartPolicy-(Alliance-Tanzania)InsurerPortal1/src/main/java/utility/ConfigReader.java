package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;
    private final String propertyFilePath = "src//test//resources//Parameters//Config.properties";

    // Keep the old static prop for backward compatibility
    private static Properties prop = new Properties();

    public ConfigReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();

                // Load static prop as well for static get()
                prop.putAll(properties);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getDriverPathChrome() {
        String driverPath = properties.getProperty("driverPathChrome");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public String getDriverPathFF() {
        String driverPath = properties.getProperty("driverPathFF");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public String getDriverPathMicroSoft() {
        String driverPath = properties.getProperty("driverPathMicroSoft");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public long getImplicitlyWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null) return Long.parseLong(implicitlyWait);
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if (url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public String getBrowserName() {
        String browserName = properties.getProperty("browserName");
        if (browserName != null) return browserName;
        else throw new RuntimeException("browserName not specified in the Configuration.properties file.");
    }

    public String getLanguageName() {
        String languageName = properties.getProperty("languageName");
        if (languageName != null) return languageName;
        else throw new RuntimeException("languageName not specified in the Configuration.properties file.");
    }

    public String sendUserId() {
        String userId = properties.getProperty("userId");
        if (userId != null) return userId;
        else throw new RuntimeException("userId not specified in the Configuration.properties file.");
    }

    public String sendPassword() {
        String password = properties.getProperty("password");
        if (password != null) return password;
        else throw new RuntimeException("password not specified in the Configuration.properties file.");
    }

    // FIXED static get() method
    public static String get(String key) {
        if (prop == null || prop.isEmpty()) {
            // Ensure properties are loaded
            new ConfigReader();
        }
        String value = prop.getProperty(key);
        if (value != null) return value;
        else throw new RuntimeException(key + " not specified in config.properties");
    }
}
