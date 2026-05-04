package Stepdefnition;

import Base.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        driver = DriverFactory.getDriver();
    }

    @When("the user logs in with username {string} and password {string}")
    public void the_user_logs_in_with_username_and_password(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.login(username, password);
    }

    @Then("the user should be redirected to the home page")
    public void the_user_should_be_redirected_to_the_home_page() {
        dashboardPage = new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.isDashboardDisplayed());
    }
}
