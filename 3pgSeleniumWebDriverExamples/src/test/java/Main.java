import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "3pgSeleniumWebDriverExamples/chromedriver.exe");
        String pageUrl = "http://automationpractice.com/index.php";
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(pageUrl);
        WebElement searchInput = driver.findElement(By.id("search_query_top"));
        searchInput.sendKeys("dress");
        //first method
        searchInput.sendKeys(Keys.ENTER);
        //second method
        WebElement searchButton = driver.findElement(By.name("submit_search"));
        searchButton.click();
//        WebElement element1 = driver.findElement(By.className(""));
//        WebElement element2 = driver.findElement(By.tagName(""));
//        WebElement element3 = driver.findElement(By.partialLinkText(""));
//        WebElement element4 = driver.findElement(By.linkText(""));
//        WebElement element5 = driver.findElement(By.name(""));
        driver.quit();
    }
}
