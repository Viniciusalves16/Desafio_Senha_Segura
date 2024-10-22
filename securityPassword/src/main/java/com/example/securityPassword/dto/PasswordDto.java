package com.example.securityPassword.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record PasswordDto (
        @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
                message = "  1 - Deve conter pelo menos uma letra minúscula." +
                        "    2 -  Deve conter pelo menos uma letra maiúscula." +
                        "    3 - Deve conter pelo menos um dígito.  " +
                        "    4 - Deve conter pelo menos um caractere especial." +
                        "    5 -  Deve ter pelo menos 8 caracteres, podendo ser letras, números ou os caracteres especiais listados.")
        @NotBlank String password){

}
