package com.eko.EcomUserAuthService.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequestDTO {
    private String name;
    private String email;
    private String phone;
    private String password;
}
