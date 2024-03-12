// Tutorial: https://www.youtube.com/watch?v=h4J58ZAWMW4
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SeleniumTest {


    public static ChromeOptions options;
    public static WebDriver driver;


    @BeforeEach
    void Setup(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");

        driver = new ChromeDriver(options);

        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

    }

    @Test
    void teststeps(){
        driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
    }


}
