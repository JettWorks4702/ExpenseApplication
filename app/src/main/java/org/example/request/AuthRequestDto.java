package org.example.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AuthRequestDto {

    private String username;
    private String password;
}
