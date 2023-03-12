import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.time.Duration;


public class TestCase {
    private HomePage homePage;
    private LoginPage loginPage;
    private CartAdd cartAdd;
    private ViewCart viewCart;
    private RemoveItem removeItem;
    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/");

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        cartAdd = new CartAdd(driver);
        viewCart = new ViewCart(driver);
        removeItem = new RemoveItem(driver);


    }
    @Test
    public void login () {

        homePage.clickLoginButton();
        loginPage.login();
        cartAdd.addToCart();
        viewCart.cart();
        removeItem.remove();


    }

    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();

    }




}
