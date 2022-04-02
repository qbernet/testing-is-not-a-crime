package com.testing.samples.integrationtesting;

import com.quentinb.testing.rest.RestApplicationConfiguration;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration
@Import(
        RestApplicationConfiguration.class
)
public class Configuration {}
