package cn.itcast.demo.conntroller;

import cn.itcast.demo.pojo.User;
import cn.itcast.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class SelfController {

    @Autowired
    private UserService userService;

    @GetMapping("hello/{id}")
    public User queryById(@PathVariable("id") Long id){
        return userService.queryById(id);

    }
}
