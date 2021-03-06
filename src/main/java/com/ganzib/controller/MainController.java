package com.ganzib.controller;

import com.ganzib.model.UserEntity;
import com.ganzib.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * get请求，访问添加用户 页面
     * @return
     */
    @RequestMapping(value = "/admin/users/add", method = RequestMethod.GET)
    public String addUser() {
        // 转到 admin/addUser.jsp页面
        return "admin/adduser";
    }

    /**
     * POST请求，处理添加用户请求，并重定向到用户管理页面
     * @param userEntity
     * @return
     */
    @RequestMapping(value = "/admin/users/addP", method = RequestMethod.POST)
    public String addUserPost(@ModelAttribute("user") UserEntity userEntity) {
        // 注意此处，post请求传递过来的是一个UserEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'user'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //userRepository.save(userEntity);

        // 数据库中添加一个用户，并立即刷新缓存
        userRepository.saveAndFlush(userEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/admin/users";
    }

    /**
     * 查看用户详情
     * @PathVariable可以收集url中的变量，需匹配的变量用{}括起来
     * 例如：访问 localhost:8080/admin/users/show/1 ，将匹配 id = 1
     * @param userId
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/admin/users/show/{id}", method = RequestMethod.GET)
    public String showUser(@PathVariable("id") Integer userId, ModelMap modelMap) {

        // 找到userId所表示的用户
        UserEntity userEntity = userRepository.findOne(userId);

        // 传递给请求页面
        modelMap.addAttribute("user", userEntity);
        return "admin/userinfo";
    }

    /**
     * 登录
     * @param modelMap
     * @param request
     * @return
     */
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
