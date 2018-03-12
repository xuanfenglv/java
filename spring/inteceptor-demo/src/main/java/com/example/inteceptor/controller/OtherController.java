package com.example.inteceptor.controller;

import com.example.inteceptor.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 17:45 2018/3/12
 * @Modified By:
 */
@RestController
public class OtherController {
    @RequestMapping("other")
    public String login(String name,String pwd,HttpServletRequest request) {

        return "other!";
    }
}
