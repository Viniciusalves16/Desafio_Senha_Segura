package com.example.securityPassword.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record PasswordDto (@NotBlank String password){

}
