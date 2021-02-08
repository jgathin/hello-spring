package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloSpringController {

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String coder){
        return "What's up, " + coder + "!\n" + "Welcome to the beautiful world of coding!!\n"
                + "We hope that you have fun!!";
    }

    @GetMapping
    @ResponseBody
    public String helloForm(){
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/hello'>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body" +
                        "</html>";
        return html;
    }
}
