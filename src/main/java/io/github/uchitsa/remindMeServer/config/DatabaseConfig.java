package io.github.uchitsa.remindMeServer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("io.github.uchitsa.remindMeServer.repository")
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan("io.github.uchitsa.remindMeServer")
public class DatabaseConfig {

    private Environment env;
}
