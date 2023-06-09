package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    //            loading the file
    //    This class will ONLY be used for getting the data from
//    configuration.properties file
    private static Properties properties;

    static {
       
        //        path of the config file
        String path = "configuration.properties";
        try {
//            Opening the file
            
            FileInputStream file = new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
//            closing the file
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //    This method accepts the key and returns the value
    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}



