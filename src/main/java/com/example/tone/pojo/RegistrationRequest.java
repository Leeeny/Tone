package com.example.tone.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class RegistrationRequest {
    private String username;
    private String password;
    private Set<String> role;
}