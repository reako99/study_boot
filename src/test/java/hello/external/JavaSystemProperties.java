package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class JavaSystemProperties {

    public static void main(String[] args) {

        System.setProperty("hello_key","hello_value");
        String hello_key = System.getProperty("hello_key");
        log.info("hello_key={}",hello_key);

        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            log.info("prop {}={}",key,System.getProperty(String.valueOf(key)));
        }

        String url = System.getProperty("url");
        String username = System.getProperty("my_username");
        String password = System.getProperty("password");

        log.info("url={}",url);
        log.info("my_username={}",username);
        log.info("password={}",password);

    }
}
