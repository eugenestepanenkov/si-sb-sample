package com.stepsoft.sisbs.core.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stepsoft.sisbs.data.config.DataConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

/**
 * @author Eugene Stepanenkov
 */
@Configuration
@PropertySource("classpath:core.properties")
@Import({DataConfig.class, FlowConfig.class})
public class CoreConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public ObjectMapper objectMapper() {

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(NON_NULL);
        return mapper;
    }
}
