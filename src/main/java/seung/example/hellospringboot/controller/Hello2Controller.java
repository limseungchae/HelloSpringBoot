package seung.example.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello2Controller {

    @GetMapping("/hello2")
    public String hello(Model m) {
        m.addAttribute("msg", "Hello, Again2!!");

        return "hello2";
    }
}
