package com.dhc.dhc_xatrain.login;

import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class IndexController {
    @GetMapping("/")
    public String welcome(){
        return "login";
    }

}
