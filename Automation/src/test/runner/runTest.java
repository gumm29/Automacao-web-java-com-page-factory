package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  glue="stepDefinition",
  features="src/test/spec/BuscaGoogle.feature"
)
public class runTest {}