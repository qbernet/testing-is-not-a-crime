package com.testing.samples.integrationtesting;

import com.quentinb.testing.rest.configuration.RestApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration
@Import(
        RestApplication.class
)
public class Configuration {}
