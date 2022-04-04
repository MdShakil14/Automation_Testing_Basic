import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class select_check_box {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Programming Related Software\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://rahulshettyacademy.com/dropdownsPractise/";

        driver.get(url);
        //driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_IndArm']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_IndArm']")).isSelected());
    }
}
