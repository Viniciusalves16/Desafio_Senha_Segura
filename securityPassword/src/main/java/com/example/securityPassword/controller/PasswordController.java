package com.example.securityPassword.controller;

import com.example.securityPassword.dto.PasswordDto;
import com.example.securityPassword.service.PasswordService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/validate-password")
public class PasswordController {

    private PasswordService passwordService;

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }
    @PostMapping()
    @Transactional
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity registerPassword(@RequestBody @Valid PasswordDto passwordDto, UriComponentsBuilder uriBuilder) {

        URI uri = uriBuilder.path("/validate-password").buildAndExpand().toUri();
        return ResponseEntity.noContent().build();



    }
}
