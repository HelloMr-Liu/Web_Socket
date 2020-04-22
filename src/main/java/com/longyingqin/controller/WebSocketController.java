package com.longyingqin.controller;

import com.longyingqin.server.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * ================================================================
 * 说明：web 通讯服务控制器
 * <p>
 * 作者          时间                    注释
 * 刘梓江	2020/4/21  15:00            创建
 * =================================================================
 **/
@Controller
@RequestMapping("/WebSocket")
public class WebSocketController {


    @RequestMapping("/showWebSocketHtml")
    public String showWebSocketHtml(){
        return "index";
    }

    /**
     * 群发消息内容
     */
    @RequestMapping(value="/sendAll", method= RequestMethod.GET)
    @ResponseBody
    public void sendAllMessage(@RequestParam(required=true) String message){
        try {
            WebSocketServer.BroadCastInfo(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 指定会话ID发消息
     */
    @RequestMapping(value="/sendOne", method=RequestMethod.GET)
    @ResponseBody
    public void sendOneMessage(@RequestParam(required=true) String message,@RequestParam(required=true) String id){
        try {
            WebSocketServer.SendMessage(message,id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
    
    
    