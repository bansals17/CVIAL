package org.cvial.utils;

import org.cvial.enums.EnvType;

import java.util.Properties;

import static org.cvial.Constants.FrameworkContants.*;

public class ConfigLoader {

    private static  final String BASE_URL = "baseUrl";

    private Properties properties;

    private static  ConfigLoader configLoader;

    private ConfigLoader(){
        String env = System.getProperty(PARAMETER_ENV, String.valueOf(EnvType.UAT));
        switch (EnvType.valueOf(env)){
            case QA: {
                properties = PropertyUtils.propertyLoader(DIRECTORY_ENV_CONFIG + ENV_CONFIG_QA);
                break;
            }
            case UAT: {
                properties = PropertyUtils.propertyLoader(DIRECTORY_ENV_CONFIG + ENV_CONFIG_UAT);
                break;
            }
            case PROD: {
                properties = PropertyUtils.propertyLoader(DIRECTORY_ENV_CONFIG + ENV_CONFIG_PROD);
                break;
            }
            default:
                throw new IllegalStateException("INVALID ENV : " + env);
        }
    }

    public static ConfigLoader getInstance(){
        if(configLoader == null){
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseUrl(){
        return  getPropertyValue(BASE_URL);
    }

    private String getPropertyValue(String propertyKey){
        String prop = properties.getProperty(propertyKey);
        if(prop != null){
            return  prop.trim();
        }else{
            throw new RuntimeException("Propery : " + propertyKey + "is not specified in config.properties file");
        }
    }

}
