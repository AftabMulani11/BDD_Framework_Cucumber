package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

    private WebDriver driver;
    private By Username = By.xpath("//input[@id='UserName']");

    private By Password = By.xpath("//input[@id='Password']");

    private By Remember = By.xpath("//span[@class='checkmark']");

    private By Signin = By.xpath("//button[@id='btnLogin']");

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public void enterusername(String name){
        WebElement ele = driver.findElement(Username);
        ele.sendKeys(name);
    }

    public void enterpassword(String pass){
        WebElement ele = driver.findElement(Password);
        ele.sendKeys(pass);
    }

    public void rememberButton(){
        driver.findElement(Remember).click();
    }

    public void signin(){
        driver.findElement(Signin).click();
    }

    public void setDriver(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("http://magnus.jalatechnologies.com/");
        driver.manage().window().maximize();
    }

    public String Title(){
        return driver.getTitle();
    }

}
