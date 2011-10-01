package com.appenginecart.system;

import java.io.IOException;
import java.util.Properties;

public class AppConfig {

    private Properties properties = new Properties();
    
    public AppConfig(String propertiesFile) throws IOException{
        Properties props = new Properties();
        props.load(this.getClass().getClassLoader().getResourceAsStream(propertiesFile));
        this.setProperties(props);
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    public String getValue(String key){
        return this.properties.getProperty(key);
    }
    
    
    
}
