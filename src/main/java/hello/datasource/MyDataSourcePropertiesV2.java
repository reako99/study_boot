package hello.datasource;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Getter
@ConfigurationProperties("my.datasource")
public class MyDataSourcePropertiesV2 {
    private String url;
    private String my_username;
    private String password;
    private Etc etc;

    @Getter
    public static class Etc{
        private int maxConnection;
        private Duration timeout;
        private List<String> options = new ArrayList<>();

        public Etc(int maxConnection, Duration timeout, @DefaultValue("Default") List<String> options) {
            this.maxConnection = maxConnection;
            this.timeout = timeout;
            this.options = options;
        }
    }

    public MyDataSourcePropertiesV2(String url, String my_username, String password, @DefaultValue Etc etc) {
        //@DefaultValue 를 넣으면 값을 찾지 못하는 경우에 기본값을 넣어줌
        this.url = url;
        this.my_username = my_username;
        this.password = password;
        this.etc = etc;
    }
}
