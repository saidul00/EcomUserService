package com.eko.EcomUserAuthService.service;

import com.eko.EcomUserAuthService.DTO.LoginRequestDTO;
import com.eko.EcomUserAuthService.DTO.SignUpRequestDTO;
import com.eko.EcomUserAuthService.DTO.UserResponseDTO;

public interface UserService {
    UserResponseDTO signup(SignUpRequestDTO signUpRequestDTO);
    UserResponseDTO login(LoginRequestDTO loginRequestDTO);
}
