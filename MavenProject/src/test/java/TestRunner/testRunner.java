package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\User\\Health-selenium\\MavenProject\\src\\test\\java\\Features\\POS Aviva Dhan Suraksha-LI=PRO(WITHOUTEkyc).feature" ,
        //features = "C:\\Users\\User\\Health-selenium\\MavenProject\\src\\test\\java\\Features\\Aviva Signature 3D Term Plan-LI=PRO(WITHOUTEkyc).feature" ,
        //features = "C:\\Users\\User\\Health-selenium\\MavenProject\\src\\test\\java\\Features\\Aviva Fortune Plus-LI=PRO(WITHOUTEkyc).feature" ,
        //features = "C:\\Users\\User\\Health-selenium\\MavenProject\\src\\test\\java\\Features\\Aviva POS-Signature Guaranteed-LI=PRO(WITHOUTEkyc).feature" ,
        //features = "C:\\Users\\User\\Health-selenium\\MavenProject\\src\\test\\java\\Features\\ANFIB-LI=PRO(WITHOUTEkyc).feature" ,
        //features = "C:\\Users\\User\\Health\\MavenProject\\src\\test\\java\\Features\\ASIP-LI=PRO(WITHOUTEkyc).feature" ,
        //features = "C:\\Users\\User\\Health\\MavenProject\\src\\test\\java\\Features\\ANWB-LI=PRO(WITHOUTEkyc).feature" ,
        //features = "C:\\Users\\User\\Health\\MavenProject\\src\\test\\java\\Features\\ANWB-LI=PRO(WITHEkyc).feature" ,
        //features = "C:\\Users\\User\\Health\\MavenProject\\src\\test\\java\\Features\\HelathClaimsClaimIDGeneration.feature" ,
        glue ="StepDefinitions" , monochrome = true,
        //tags = "@SmokeTest3" ,
        plugin = {"pretty", "html:target/cucumber.html" , "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class testRunner  {

}
