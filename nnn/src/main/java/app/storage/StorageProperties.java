package app.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

//    $ mkdir upload-files
//    aine ukijumotahaneniarukenia aine-MS-7B98 17:08:36 ~/java-spring-web-upload-server$
//    $ touch upload-files/test.txt

    private String location = "/home/aine/java-spring-web-upload-server/upload-files";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}