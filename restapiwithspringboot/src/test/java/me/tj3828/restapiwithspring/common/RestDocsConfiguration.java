package me.tj3828.restapiwithspring.common;

import org.springframework.boot.test.autoconfigure.restdocs.RestDocsMockMvcConfigurationCustomizer;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentationConfigurer;

import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;

/**
 * @author tj3828
 */

@TestConfiguration
public class RestDocsConfiguration {

    @Bean
    public RestDocsMockMvcConfigurationCustomizer restDocsMockMvcConfigurationCustomizer() {
        return configurer -> {
            configurer.operationPreprocessors().withRequestDefaults(prettyPrint());
            configurer.operationPreprocessors().withResponseDefaults(prettyPrint());
        };
    }

}
