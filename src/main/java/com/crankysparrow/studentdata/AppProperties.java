package com.crankysparrow.studentdata;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@ConfigurationProperties("app")
@Data
@Validated
public class AppProperties {
    @NotBlank
    private String secret;
}
