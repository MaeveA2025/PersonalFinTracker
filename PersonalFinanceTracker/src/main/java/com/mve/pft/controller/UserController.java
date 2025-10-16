package com.mve.pft.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mve.pft.service.JwtService;
import com.mve.pft.service.UserInfoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
public class UserController {
    
    private UserInfoService userService;

    private JwtService jwtService;

    private AuthenticationManager authManager;

    @GetMapping("/")
    public String welcome() {
        return null;
    }

   
}
