package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SetupDrivers {

    public static WebDriver driver;

    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("-->Start-maximized");
        options.addArguments("-->disable-notifications");

        driver = new ChromeDriver(options);
        System.out.println("Chrome browser is launched");

        driver.manage().window().maximize();
        System.out.println("Browser window is maximized");

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        System.out.println("Pageload timeout is given");

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        System.out.println("Implicit wait is mentioned");

        driver.get("https://www.jcpenney.com/");
        System.out.println(">>JCPenny application is loaded");
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void tearDownDriver(){
        if (driver!=null){
            driver.close();
//            driver.quit();
            System.out.println("Browser is closed");
        }
    }
}
