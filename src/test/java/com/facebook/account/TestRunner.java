package com.facebook.account;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\FaceBook.feature",
                 glue="com.facebook.account",
                 tags="@sanity",
                 plugin= {"html:target","json:target/reports.json"},
                 dryRun=false,
                 monochrome=true)

public class TestRunner {

}
