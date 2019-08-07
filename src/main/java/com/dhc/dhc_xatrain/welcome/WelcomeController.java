package com.dhc.dhc_xatrain.welcome;

import com.dhc.dhc_xatrain.mapper.Websites;
import com.dhc.dhc_xatrain.welcome.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("welcome")
public class WelcomeController {

    @Autowired
    private WelcomeService welcomeService;

    @RequestMapping(value = "/loadPage")
    public String loadPage(HttpServletRequest request, HttpServletResponse response){

        return "Hello World!";
    }
    @RequestMapping(value = "/getWebSites")
    public List<Websites> getWebSites(HttpServletRequest request, HttpServletResponse response){
        return welcomeService.getWebSites();
    }

}
