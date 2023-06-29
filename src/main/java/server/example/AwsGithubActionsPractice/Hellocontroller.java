package server.example.AwsGithubActionsPractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Hellocontroller {
    @GetMapping
    public String hello(){
        String hi = "hello";
        return hi;
    }
}
