package rj.javascript.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AjaxController {

    @GetMapping("/message")
    public String getMessage() {
        return "Hello from Spring Boot AJAX Controller!";
    }
}
