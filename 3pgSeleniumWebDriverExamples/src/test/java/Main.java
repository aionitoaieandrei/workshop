import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MadalinaPc\\chromedriver.exe");
        String pageUrl = "http://automationpractice.com/index.php";
        // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(pageUrl);
        WebElement element = driver.findElement(By.id(""));
        WebElement element1 = driver.findElement(By.className(""));
        WebElement element2 = driver.findElement(By.tagName(""));
        WebElement element3 = driver.findElement(By.partialLinkText(""));
        WebElement element4 = driver.findElement(By.linkText(""));
        WebElement element5 = driver.findElement(By.name(""));
        driver.close();
    }
}
