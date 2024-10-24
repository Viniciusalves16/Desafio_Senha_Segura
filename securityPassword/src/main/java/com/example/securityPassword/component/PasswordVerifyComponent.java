package com.example.securityPassword.component;

import com.example.securityPassword.dto.PasswordDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PasswordVerifyComponent {

    public List<String> CheckRules(PasswordDto passwordDto) {
        String password = passwordDto.password();
        List<String> errorsMessage = new ArrayList<>();

        if (password == null || password.isEmpty()) {
            errorsMessage.add("Senha não pode estar vazia");
        }
        if (!password.matches(".{8,}")) {
            errorsMessage.add("Senha deve conter o minimo de 8 caracteres");
        }
        if (!password.matches("(?=.*[A-Z]).*")) {
            errorsMessage.add("Senha deve conter pelo menos uma letra maiuscula");
        }
        if (!password.matches("(?=.*[a-z]).*")) {
            errorsMessage.add("Senha deve conter pelo menos uma letra minuscula");
        }
        if (!password.matches("(?=.*\\d).*")) {
            errorsMessage.add("Senha deve conter pelo menos um digito numérico");
        }
        if (!password.matches("(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).*")) {
            errorsMessage.add("Senha deve conter pelo menos um caracter especial");
        }
        return errorsMessage;
    }
}
