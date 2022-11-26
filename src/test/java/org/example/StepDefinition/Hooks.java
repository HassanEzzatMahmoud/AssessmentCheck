package org.example.StepDefinition;

// your code inside the class will be like this
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class Hooks {
    public static WebDriver driver;

    @Before
    public static void OpenBrowser() {
        // 1- Bridge
        String chromepath=  System.getProperty("user.dir")+ "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromepath);
        //3- Configurations
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
// 4- navigate to url
        driver.get("https://codenboxautomationlab.com/registration-form/");
    }
    @After
    public static void quitDriver() throws InterruptedException {
        //Just to wait to see the behvior action
        Thread.sleep(3000);
        driver.quit();
    }
}
