package com.eko.EcomUserAuthService.DTO;

import com.eko.EcomUserAuthService.entity.User;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequestDTO {
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 3,max = 50, message = "Username must contain 3-50 characters.")
    private String name;

    @Email(message = "Invalid email.")
    private String email;

    @NotEmpty
    @Pattern(regexp = "^\\d{3}-\\d{3}-\\d{4}$", message = "Invalid phone number.")
    private String phone;

    @NotEmpty
    @Size(min = 8, max = 50, message = "Password must be 8 to 64 characters long.")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+={}\\[\\]:;<>,.?/~]).{8,64}$",
    message = "Password must contain at least one digit, one lowercase letter, one uppercase letter, and one special symbol.")
    private String password;
}
