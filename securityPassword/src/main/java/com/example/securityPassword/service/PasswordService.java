package com.example.securityPassword.service;

import com.example.securityPassword.component.PasswordVerifyComponent;
import com.example.securityPassword.dto.PasswordDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class PasswordService {

    private PasswordVerifyComponent passwordVerifyComponent;

    public PasswordService(PasswordVerifyComponent passwordVerifyComponent) {
        this.passwordVerifyComponent = passwordVerifyComponent;
    }

    public ResponseEntity<Object> verifyPassword(PasswordDto passwordDto, UriComponentsBuilder uriBuilder) {

        var response = passwordVerifyComponent.CheckRules(passwordDto);

        if (response.isEmpty()) {
            URI uri = uriBuilder.path("/validate-password").buildAndExpand().toUri();
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.badRequest().body(response);
        }

    }
}
