package com.example.securityPassword.service;

import com.example.securityPassword.dto.PasswordDto;
import org.springframework.stereotype.Service;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@Service
public class PasswordService {

    public Boolean passwordManagement(PasswordDto passwordDto) {




//        String regExpn = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
//        CharSequence inputPassword = passwordDto.password();
//
//        Pattern pattern = Pattern.compile(regExpn,Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(inputPassword);
//        if(matcher.matches())
//            return true;
//        else
//            return false;
        return true;
    }
}
