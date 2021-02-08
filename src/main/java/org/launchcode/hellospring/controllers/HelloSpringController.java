package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class HelloSpringController {

    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String createMessage(@RequestParam String coder, String language){


        switch (language){
            case "english":
                return "Hello, " + coder;

            case "french":
                return "Bonjour, " + coder;

            case "spanish":
                return "Hola, " + coder;

            case "german":
            case "dutch":
                return "Hallo, " + coder;
            case "portuguese":
                return "Ola, " + coder;
            case "italian":
                return "Ciao, " + coder;

        }
    return language;
    }

    @GetMapping
    @ResponseBody
    public String helloForm(){
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/hello' id = 'helloform'>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<select id = 'languages' name = 'language' form = 'helloform' />"+
                        "<option value = 'english'>English</option>" +
                        "<option value = 'french'>French</option>" +
                        "<option value = 'spanish'>Spanish</option>" +
                        "<option value = 'german'>German</option>" +
                        "<option value = 'dutch'>Dutch</option>" +
                        "<option value = 'portuguese'>Portuguese</option>" +
                        "<option value = 'italian'>Italian</option>" +
                        "</select>" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body" +
                        "</html>";
        return html;
    }

//    @GetMapping("goodbye")
//    @ResponseBody
//    public String helloGoodbye(){
//        return "Hello, Goodbye my niggas!!";
//    }
}
