import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class auto_suggestive_dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Programming Related Software\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String URL = "https://rahulshettyacademy.com/dropdownsPractise/";

        driver.get(URL);
        driver.findElement(By.id("autosuggest")).sendKeys("ban");
        Thread.sleep(3000);

        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement x:options){

            if(x.getText().equals("Bangladesh")){
                x.click();
            }

            System.out.println(x.getText());

        }
    }
}
