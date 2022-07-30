package com.example.tone.service;

import com.example.tone.pojo.MessageResponse;
import com.example.tone.pojo.UserDto;
import org.springframework.http.ResponseEntity;

public interface UserService {
    public ResponseEntity<MessageResponse> registerNewUserAccount(UserDto userDto);
}
