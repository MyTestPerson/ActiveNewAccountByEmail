package com.security.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { SQLConfigSakh.class, RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { FreeMarkerConfig.class, EmailConfig.class, Config.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }


}