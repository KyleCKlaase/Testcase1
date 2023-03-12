package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewCart {
    private WebDriver driver;

    public ViewCart(WebDriver driver) {
        this.driver = driver;

    }
    public void cart(){
        //click on basket
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();


    }


}