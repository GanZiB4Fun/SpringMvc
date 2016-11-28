package com.ganzib.controller;

import com.ganzib.model.UserEntity;
import com.ganzib.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by GanZiB on 16/11/28.
 */
@Controller
public class MainController {

    /**
     * 自动装配数据库接口，不需要再写原始的Connection来操作数据库
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * 进入首页
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    /**
     * 后台查询user表中所有记录
     * 将所有记录传递给要返回的jsp页面，放在userList当中
     * 返回pages目录下的admin/users.jsp页面
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/admin/users",method = RequestMethod.GET)
    public String getUsers(ModelMap modelMap){
        List<UserEntity> userList = userRepository.findAll();
        modelMap.addAttribute("userList",userList);
        return "admin/users";

    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(ModelMap modelMap, HttpServletRequest request){
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if("GanZiB".equals(userName)&&"GanZiB2PaPa".equals(password)){
            List<UserEntity> userList = userRepository.findAll();
            modelMap.addAttribute("userList",userList);
            return "admin/users";
        }else {
            return "index";
        }
    }

}
