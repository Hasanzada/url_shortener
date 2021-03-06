package com.example.url_shortner.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegRqUser {

    private String fullName;
    private String username;
    private String password;
    private String passwordConfirm;

}
