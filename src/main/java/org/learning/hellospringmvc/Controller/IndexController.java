package org.learning.hellospringmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(){
        return "home";
    }

    @GetMapping("/about-us")
    public String aboutUs(){
        // ritorna il nome del template about.html che si trova in resources/templates
        return "about-us";
    }

    @GetMapping("/terms-and-conditions")
    public String termsAndConditions(){
        // ritorna il nome del template about.html che si trova in resources/templates
        return "terms-and-conditions";
    }
}
