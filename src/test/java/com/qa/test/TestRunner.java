package com.qa.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:build/cucumber/cucumber-html-report/index.html",
        "json:build/cucumber/cucumber.json" },
                 features={ "src/test/resources/features" },
                 tags={ "@SmokeTest" })
public class TestRunner { }
