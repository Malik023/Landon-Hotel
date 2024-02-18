package edu.wgu.d387_sample_code.rest;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "http://localhost:4200")
public class WelcomeMessageController {

    @GetMapping("/welcome")

    public String[] getWelcomeMessages() {
        return WelcomeMessage.getWelcomeMessage();
    }
}
