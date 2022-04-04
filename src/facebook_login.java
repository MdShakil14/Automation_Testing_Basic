import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class facebook_login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Programming Related Software\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
//        driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("shakil@gmail.com");
//        driver.findElement(By.cssSelector("#pass")).sendKeys("123445");
        //driver.findElement(By.name("login")).click();

//        driver.findElement(By.xpath("//*[text()='Create a Page']")).click();

        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Sssaaaa");
    }
}
