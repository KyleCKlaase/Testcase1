package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
       this.driver = driver;

    }

    //click on login button
    public void clickLoginButton(){
       driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

    }
    //Validate
    public boolean validateElementExist(String Text ){
        boolean status = driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed();

           return status;

        }


}
