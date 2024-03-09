package hello.datasource;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.util.List;

@Slf4j
public class MyDataSource {

    private String url;
    private String my_username;
    private String password;
    private int maxConnection;
    private Duration timeout;
    private List<String> options;

    public MyDataSource(String url, String my_username, String password, int maxConnection, Duration timeout, List<String> options) {
        this.url = url;
        this.my_username = my_username;
        this.password = password;
        this.maxConnection = maxConnection;
        this.timeout = timeout;
        this.options = options;
    }

    @PostConstruct
    public void init(){
        log.info("");
        log.info("");
        log.info("");
        log.info("");
        log.info("");
        log.info("");
    }
}
