package server.example.AwsGithubActionsPractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hellocontroller {
    @GetMapping("/")
    public String hello(){
        String hi = "hello";
        return hi;
    }
}
