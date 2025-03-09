package com.imtiyaz.perday;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/welcome")
public class Welcome {


    @GetMapping("/")    
    public String welcomePage(){
        return "welcome";
    }
    
}
