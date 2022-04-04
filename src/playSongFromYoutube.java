import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class playSongFromYoutube {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Programming Related Software\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Tum lime song");
        driver.findElement(By.xpath("//*[@id=\'search-icon-legacy\']")).click();
        driver.findElement(By.cssSelector("#img")).click();
    }
}
