package net.dg.userservice.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.dg.userservice.entity.User;
import net.dg.userservice.service.UserService;
import net.dg.userservice.vo.ResponseTemplateVO;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }

}
