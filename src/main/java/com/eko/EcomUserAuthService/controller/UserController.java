package com.eko.EcomUserAuthService.controller;

import com.eko.EcomUserAuthService.DTO.LoginRequestDTO;
import com.eko.EcomUserAuthService.DTO.SignUpRequestDTO;
import com.eko.EcomUserAuthService.DTO.UserResponseDTO;
import com.eko.EcomUserAuthService.service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<UserResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO){
        return null;
    }

    @GetMapping("/logout")
    public ResponseEntity logout(){
        return null;
    }

    @PostMapping("/signup")
    public ResponseEntity<UserResponseDTO> signup(@RequestBody SignUpRequestDTO signUpRequestDTO){
        return null;
    }

    @GetMapping("/validator")
    public ResponseEntity validate(){
        return null;
    }
}
