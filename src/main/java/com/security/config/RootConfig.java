package com.security.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.security.security", "com.security.repository"})
public class RootConfig {
}