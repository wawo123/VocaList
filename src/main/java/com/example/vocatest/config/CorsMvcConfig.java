package com.example.vocatest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsMvcConfig implements WebMvcConfigurer {
//
    @Value("${config.front_url}")
    private String frontUrl;

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
//        corsRegistry.addMapping("/**")
//                .allowedOriginPatterns("*")
//                .allowedMethods(
//                        HttpMethod.GET.name(),
//                        HttpMethod.HEAD.name(),
//                        HttpMethod.POST.name(),
//                        HttpMethod.POST.name(),
//                        HttpMethod.PUT.name(),
//                        HttpMethod.PATCH.name(),
//                        HttpMethod.DELETE.name(),
//                        HttpMethod.OPTIONS.name(),
//                        HttpMethod.TRACE.name()
//                );
//    }
        corsRegistry.addMapping("/**")
                .allowedOrigins(frontUrl)
//                .allowedOrigins("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .maxAge(3600)
                .allowCredentials(true);
    }
}