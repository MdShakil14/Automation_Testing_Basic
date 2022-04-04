import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pickabo_signup {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Programming Related Software\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String URL = "https://www.pickaboo.com/";

        driver.get(URL);

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Register")).click();
        //Create account
        driver.findElement(By.id("firstname")).sendKeys("Mohammad");
        driver.findElement(By.id("lastname")).sendKeys("Shakil");
        driver.findElement(By.id("customer_mobile")).sendKeys("01532294746");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("mahfuzur.batterylowinteractive@gmail.com");
        driver.findElement(By.id("password")).sendKeys("myppppackbo");
        driver.findElement(By.id("password-confirmation")).sendKeys("myppppackbo");


    }
}
