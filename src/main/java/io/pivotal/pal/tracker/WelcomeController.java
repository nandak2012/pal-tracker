package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by e046037 on 11/13/17.
 */
@RestController
public class WelcomeController {


    private String hello_message;

    public WelcomeController(@Value("${WELCOME_MESSAGE}") String hello_message) {
        this.hello_message = hello_message;
    }

    @GetMapping("/")
    public String sayHello() {
        return hello_message;
    }


}
