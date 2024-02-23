package hello.spring;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("/hello-spring")
    public String hello(){
        System.out.println("HelloController.hello");
        return "hello spring!";
    }
}
