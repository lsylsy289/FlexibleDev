package com.flexible.dev.layout;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * Created by lsylsy289.
 * Since 2017-03-25
 */

@Configuration
public class ThymeleafConfig {

    @Bean
    public TemplateResolver templateResolver(){
        return new TemplateResolver();
    }

    @Bean
    public SpringTemplateEngine templateEngine(){
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        templateEngine.addDialect(new LayoutDialect());
        return templateEngine;
    }
}
