package com.email.email_assistant.dto;

import lombok.Data;

@Data
public class EmailRequest {

    private String emailContent;
    private String tone;
}
