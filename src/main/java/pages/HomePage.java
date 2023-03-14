package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    //click on login button
    public void clickLoginButton() {
        driver.findElement(By.xpath("//a[text()='Log in']")).click();

    }

    //Add to cart
    public void addToCart(String item) {
        //click on item
        driver.findElement(By.xpath("//h2//a[text()='"+item+"']")).click();

        //click add item to cart
        driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']")).click();

    }


    //View Cart
    public void goToCart() {
        //click on basket
        driver.findElement(By.xpath("//a[@class='ico-cart']")).click();


    }


    //Validate Email
    public boolean validateElementExist(String text) {
        boolean status = driver.findElement(By.xpath("//a[text()='" + text + "']")).isDisplayed();
        return status;
    }

    //Validate Item was added
    public boolean validateItemAdded() {
        boolean status = driver.findElement(By.xpath("//p[contains(text(),'The product has been added to your')]")).isDisplayed();
        return status;

    }

//    public void addSpecificItem(String item){
//
//        driver.findElement(By.xpath("//a[text()='"+item+"']//ancestor::div[@class='product-item']//input[@type='button']")).click();
//
//
//    }



}



