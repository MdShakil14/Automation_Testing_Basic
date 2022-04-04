import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Programming Related Software\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String URL = "https://book.spicejet.com/search.aspx";

        driver.get(URL);

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
    }
}
