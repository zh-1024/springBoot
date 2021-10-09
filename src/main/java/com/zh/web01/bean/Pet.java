package com.zh.web01.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@ConfigurationProperties(prefix = "pet")
public class Pet {
    private String name;
    private Integer age;
}
