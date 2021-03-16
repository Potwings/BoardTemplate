package org.potwings.time.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@MapperScan(basePackages = "org.potwings.time.mapper")
@ComponentScan(basePackages = "org.potwings.time.service")
public class TimeConfig {

}
