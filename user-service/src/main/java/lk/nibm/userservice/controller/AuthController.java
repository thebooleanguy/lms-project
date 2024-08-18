package lk.nibm.userservice.controller;

import lk.nibm.userservice.model.User;
import lk.nibm.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        // Implement authentication logic here
        return "Token";
    }

    @PostMapping("/logout")
    public void logout() {
        // Implement logout logic here
    }

    // Other authentication-related endpoints
}

