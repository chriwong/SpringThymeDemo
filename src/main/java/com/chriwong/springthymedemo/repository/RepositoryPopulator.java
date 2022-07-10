package com.chriwong.springthymedemo.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@Configuration
public class RepositoryPopulator {

    /**
     * This Bean will load data into the database.
     */
    @Bean
    public Jackson2RepositoryPopulatorFactoryBean createRepositoryPopulator() {
        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(new Resource[] { new ClassPathResource("nobelprize.json") });
        return factory;
    }
}
