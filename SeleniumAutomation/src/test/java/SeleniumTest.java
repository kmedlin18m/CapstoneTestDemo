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
    void teststeps() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();

        driver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("kirsten");
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

        Thread.sleep(2000);

        driver.close();

    }


}
