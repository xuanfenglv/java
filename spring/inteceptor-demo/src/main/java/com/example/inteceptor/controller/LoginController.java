package com.example.inteceptor.controller;

import com.example.inteceptor.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 17:14 2018/3/12
 * @Modified By:
 */
@RestController
public class LoginController {

    @RequestMapping("login")
    public String login(String name,String pwd,HttpServletRequest request) {
        HttpSession session = request.getSession();

        if(name.equals("root")&&pwd.equals("root")) {
            User user = new User();
            user.setName(name);
            session.setAttribute("user",user);
            return "登录成功";
        } else {
            return "用户名或密码错误!";
        }
    }
}
