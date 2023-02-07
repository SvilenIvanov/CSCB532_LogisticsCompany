package com.example.logistics.configurations;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.logistics.commons.utils.Mapper;

@Configuration
public class ApplicationBeanConfiguration {
    // Bean to create a ModelMapper instance
    @Bean
    public ModelMapper createModelMapper() {
        return new ModelMapper();
    }

    // Bean to create a Mapper instance and uses ModelMapper as a dependency
    @Bean
    public Mapper mapper(ModelMapper modelMapper) {
        return new Mapper(modelMapper);
    }

    // Bean to create an instance of BCryptPasswordEncoder
    @Bean
    public PasswordEncoder createPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Bean to create an instance of UriComponentsBuilder with scope prototype
    @Bean
    @Scope(value = SCOPE_PROTOTYPE)
    public UriBuilder createUriComponentsBuilder() {
        return UriComponentsBuilder.newInstance();
    }
}
