import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Programming Related Software\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String URL = "https://book.spicejet.com/search.aspx";

        driver.get(URL);

        Select select_currency = new Select(driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency']")));
        select_currency.selectByValue("CAD");
        select_currency.selectByIndex(7);
        select_currency.selectByVisibleText("USD");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.id("divpaxinfo")).click();
        Select select_adult = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
        select_adult.selectByValue("5");

        Select select_child = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
        select_child.selectByValue("3");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());



    }
}
