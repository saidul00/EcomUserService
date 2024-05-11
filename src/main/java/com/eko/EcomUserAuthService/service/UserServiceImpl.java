package com.eko.EcomUserAuthService.service;

import com.eko.EcomUserAuthService.DTO.LoginRequestDTO;
import com.eko.EcomUserAuthService.DTO.SignUpRequestDTO;
import com.eko.EcomUserAuthService.DTO.UserResponseDTO;
import com.eko.EcomUserAuthService.entity.User;
import com.eko.EcomUserAuthService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponseDTO signup(SignUpRequestDTO signUpRequestDTO) {
        User newUser = convertToEntity(signUpRequestDTO);
        User savedUser = userRepository.save(newUser);
        return UserResponseDTO.from(savedUser);
    }
    private User convertToEntity(SignUpRequestDTO signUpRequestDTO){
        User user = new User();
        user.setName(signUpRequestDTO.getName());
        user.setEmail(signUpRequestDTO.getEmail());
        user.setPhone(signUpRequestDTO.getPhone());
        user.setPassword(signUpRequestDTO.getPassword());
        return user;
    }

    @Override
    public UserResponseDTO login(LoginRequestDTO loginRequestDTO) {
        return null;
    }
}
