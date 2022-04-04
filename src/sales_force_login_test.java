import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sales_force_login_test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Programming Related Software\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Shakil@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\'Login\']")).click();

        String errorMessage = driver.findElement(By.xpath("//*[@id=\'error\']")).getText();
        System.out.println(errorMessage);

        driver.navigate().back();

        driver.close();
    }
}
