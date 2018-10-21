package com.baizhi.contreller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/tset")
    public String test() {
        System.out.println("==============");
        return "12313";
    }

    @RequestMapping("/selectAll")
    public String selectAll(HttpServletRequest hsr) {
        List<User> list = userService.selectAll();
        hsr.setAttribute("user", list);
        return "index";
    }

    @RequestMapping("/save")
    public void save(User u) {
        userService.save(u);
    }


}
