package org.cvial.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(

            tags = (" @Sanity"),
            features = "src/test/resources/features",
            glue = {"org.cvial"},
            plugin = {"pretty",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber/"
            },
            monochrome = true
    )
    public class TestRunner{

}
