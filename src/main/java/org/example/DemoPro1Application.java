package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DemoPro1Application extends Application<DemoPro1Configuration> {

    public static void main(final String[] args) throws Exception {
        new DemoPro1Application().run(args);
    }

    @Override
    public String getName() {
        return "DemoPro1";
    }

    @Override
    public void initialize(final Bootstrap<DemoPro1Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DemoPro1Configuration configuration,
                    final Environment environment) {
        System.out.println("data !!");
    }

}
