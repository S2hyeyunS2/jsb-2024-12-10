package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //스프링에서는 Controller로 취급이 된다
public class MainController {
    //Get http://localhost:8080/
    @GetMapping("/")
    public void home() {
        System.out.println("Home");
    }

    //Get http://localhost:8080/about
    @GetMapping("/about")
    public void about() {
        System.out.println("about");
    }
}
