package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import step_definitions.step_impl.AdminPage_impl;
import step_definitions.step_impl.HomePage_impl;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class HomePage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();

    @Given("User opens home page")
    public void user_opens_home_page() {
//        Driver.getDriver().get(ConfigReader.readProperty("url"));
    }
    @When("Verify title is {string}")
    public void verify_title_is(String string) {
      HomePage_impl.verifyTitle();
    }
}