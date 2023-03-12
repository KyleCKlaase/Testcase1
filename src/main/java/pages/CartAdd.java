package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartAdd {
    private WebDriver driver;
    public CartAdd(WebDriver driver) {
        this.driver = driver;

    }
    public void addToCart(){
        //click on item
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/h2/a")).click();

        //click add item to cart
        driver.findElement(By.id("add-to-cart-button-31")).click();



    }



}