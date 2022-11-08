package test_runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login/login.feature"},glue= {"Defination"},tags ="@PositiveTesting",plugin = {"html:savitha/savi.html"})
public class test_runner1 {

}
