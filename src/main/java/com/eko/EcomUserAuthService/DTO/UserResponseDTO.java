package com.eko.EcomUserAuthService.DTO;

import com.eko.EcomUserAuthService.entity.Role;
import com.eko.EcomUserAuthService.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class UserResponseDTO {
    private String name;
    private String email;
    private List<Role> roles;

    public static UserResponseDTO from(User user){
        if(user==null)
            return null;

        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.name = user.getName();
        userResponseDTO.email = user.getEmail();
        if(!(user.getRoles()== null || user.getRoles().isEmpty())){
            userResponseDTO.roles = user.getRoles().stream().toList();
        }
        return userResponseDTO;
    }
}
