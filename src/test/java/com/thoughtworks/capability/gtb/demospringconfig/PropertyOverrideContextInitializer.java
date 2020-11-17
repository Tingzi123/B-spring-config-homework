package com.thoughtworks.capability.gtb.demospringconfig;

import javafx.application.Application;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.TestPropertySourceUtils;


@RunWith(SpringRunner.class)
@ContextConfiguration(
        initializers = PropertyOverrideContextInitializer.class,
        classes = Application.class)
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
