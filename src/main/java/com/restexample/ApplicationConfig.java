package com.restexample;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.inject.Named;

/**
 * Created by jorge.lopez on 4/4/2017.
 */
@Configuration
public class ApplicationConfig {
    @Named
    static class JerseyConfig extends ResourceConfig {
        public JerseyConfig(){
            this.packages("com.restexample");
        }
    }
}
