package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveItem {
    private WebDriver driver;

    public RemoveItem(WebDriver driver) {
        this.driver = driver;


}
public void remove(){
        //select item
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[1]/input")).click();

        //update cart to remove item
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")).click();


}

}
