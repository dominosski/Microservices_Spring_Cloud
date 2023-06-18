package com.example.microservices.limitsservice.configuration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    @Value("${limits-service.minimum}")
    private int minimum;
    @Value("${limits-service.maximum}")
    private int maximum;
}
