package steppackage;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class LoginTest {
    private WebDriver driver;
    private LoginPage log;

    public LoginTest(WebDriver driver) {
        this.driver = driver;
    }

    public void exit(){
        if(driver!=null) {
            driver.quit();
        }
    }

    @Given("User already on Login Page")
    @Before
    public void  User_already_on_Login_Page(){
        log = new LoginPage(driver);
        log.setDriver();
        String title = log.Title();
        Assert.assertEquals("Login", title);
    }
    @Given("User enters userID and password")
    public void user_enters_user_id_and_password() throws InterruptedException{
        log.enterusername("training@jalaacademy.com");
		Thread.sleep(500);
        log.enterpassword("jobprogram");
		Thread.sleep(500);
    }
    @And("Click on Remember me button")
    public void click_on_remember_me_button() throws InterruptedException{
        log.rememberButton();
		Thread.sleep(500);

    }
    @And("Click on Sign in button")
    public void click_on_sign_in_button() throws InterruptedException{
        log.signin();
		Thread.sleep(500);
    }
    @Then("User validate the Dashboard")
    public void user_validate_the_dashboard() throws InterruptedException{
        Thread.sleep(500);
        String title = log.Title();
        Assert.assertEquals("Magnus", title);
        Thread.sleep(500);
        exit();
    }
}
