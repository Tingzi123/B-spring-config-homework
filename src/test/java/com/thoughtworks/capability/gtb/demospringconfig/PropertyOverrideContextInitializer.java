package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.support.TestPropertySourceUtils;

public class PropertyOverrideContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    static final int LEVEL_NUMBER = 0;

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        TestPropertySourceUtils.addInlinedPropertiesToEnvironment(
                configurableApplicationContext, "levelNumber=" + LEVEL_NUMBER);

        TestPropertySourceUtils.addPropertiesFilesToEnvironment(
                configurableApplicationContext, "context-override-application.properties");
    }
}
