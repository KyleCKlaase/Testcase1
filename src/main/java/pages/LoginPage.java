package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;

    }

    public void login(String email,String password){
        //add username and password
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys(email);
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys(password);

        //click login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginBtn.click();


    }









}





