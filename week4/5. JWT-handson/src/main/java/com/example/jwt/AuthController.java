package com.example.jwt;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        if ("admin".equals(user.getUsername()) && "password".equals(user.getPassword())) {
            return JwtUtil.generateToken(user.getUsername());
        } else {
            return "Invalid credentials";
        }
    }
}