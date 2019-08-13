package com.dhc.dhc_xatrain.wisely;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WsController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message){
//        try {
//            Thread.sleep(3000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        System.out.println("发来消息: " + message.getName());
        return new WiselyResponse("Welcome, " + message.getName() + "!");
    }
}
