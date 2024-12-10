package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //스프링에서는 Controller로 취급이 된다
public class MainController {
    //Get http://localhost:8080/
    @GetMapping("/")
    @ResponseBody //리턴한 값을 고객에게 보여준다
    public int home() {
        System.out.println("Home");
        return 22;
    }

    //Get http://localhost:8080/about
    @GetMapping("/about")
    @ResponseBody
    public String about() {
        System.out.println("about");
        return "안녕하세요.";
    }

    public void contact(){
        System.out.println("contact");
    }
}
