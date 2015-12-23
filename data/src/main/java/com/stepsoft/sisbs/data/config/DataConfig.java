package com.stepsoft.sisbs.data.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Eugene Stepanenkov
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:data.properties")
public class DataConfig {
}
