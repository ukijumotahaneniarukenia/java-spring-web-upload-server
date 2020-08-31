package app.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

    private static String STORE_PARENT_LOCATION = "/home/aine/java-spring-web-upload-server";

    private String storeLocation = STORE_PARENT_LOCATION + "/upload-files";

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String location) {
        this.storeLocation = location;
    }
}