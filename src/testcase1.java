import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\\\Programming Related Software\\\\Selenium\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.yahoo.com/");
        driver.findElement(By.className("phone-no")).sendKeys("Hi@gmail.com");
        driver.findElement(By.linkText("Forgot username?")).click();


    }
}
