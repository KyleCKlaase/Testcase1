import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.*;
import java.time.Duration;



public class TestCase {
    private HomePage homePage;
    private LoginPage loginPage;
    private CartPage cartPage;
    private WebDriver driver;
    private String email = "kylecalvinklaase@outlook.com";
    private String password = "Password123";


    @BeforeEach
    public void setUp(){
        //Booting Driver
        System.out.println("Setting up");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //Maximizes window
        driver.manage().window().maximize();
        //Small wait for elements to fully load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/");

        //Passing driver to pages
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        cartPage = new CartPage(driver);


    }
    @Test
    public void login () {
        System.out.println("Logging in");
        homePage.clickLoginButton();
        //Encapsulation of email and password values(reusing)
        loginPage.login(email,password);
        //Validate the email the person use is displayed
        Assertions.assertTrue(homePage.validateElementExist(email),"Login email not found on server");
        //Clicks specific item on homepage
        homePage.addToCart("14.1-inch Laptop");
        //Validate item has been added(notification)
        Assertions.assertTrue(homePage.validateItemAdded(),"Item wasn't added");
        homePage.goToCart();
        cartPage.removeItem();


    }

    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();

    }




}
