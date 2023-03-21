package com.bazaarvoice;

import com.bazaarvoice.resources.HelloWorldResource;
import com.bazaarvoice.resources.LearningTheApp;
import com.codahale.metrics.health.HealthCheck;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardExampleApplication extends Application<DropwizardExampleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardExampleApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropwizardExample";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardExampleConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropwizardExampleConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new HelloWorldResource());
        environment.jersey().register(new LearningTheApp());
        environment.healthChecks().register("bv", new HealthCheck() {
            @Override
            protected Result check() throws Exception {
                return Result.unhealthy("I don't know");
            }
        });
    }

}
