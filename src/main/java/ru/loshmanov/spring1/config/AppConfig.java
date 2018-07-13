package ru.loshmanov.spring1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("ru.loshmanov.spring1.repository")
@EnableTransactionManagement
@ComponentScan("ru.loshmanov.spring1.service")
@Import(DataSourceConfig.class)
public class AppConfig {

}
