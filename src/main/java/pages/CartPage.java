package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;

    }

    public void removeItem(){
        //Tick box of item
        driver.findElement(By.xpath("//input[@name='removefromcart']")).click();

        //update cart to remove item
        driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();

    }



}
