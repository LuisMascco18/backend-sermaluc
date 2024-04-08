package com.backendsermaluc.config;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Data
@Component
public class ApplicationProperties {

    @Value("${property.type.password}")
    private String  passwordValue;

    @Value("${property.type.email}")
    private String  emailValue;

}
