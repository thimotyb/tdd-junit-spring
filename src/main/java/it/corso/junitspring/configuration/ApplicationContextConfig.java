package it.corso.junitspring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("it.corso.junitspring.*")
@ImportResource("classpath:application-context.xml")
@EnableJpaRepositories
@EnableTransactionManagement
public class ApplicationContextConfig {

	
  
}
