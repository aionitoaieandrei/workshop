import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String pageUrl = "http://automationpractice.com/index.php";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.get(pageUrl);
        //by id
//        WebElement searchInputById = driver.findElement(By.id("search_query_top"));
//        searchInputById.sendKeys("dress");
        //by name
        WebElement searchInputByName = driver.findElement(By.name("search_query"));
        searchInputByName.sendKeys("dress");
        //first method
        // searchInputByName.sendKeys(Keys.ENTER);
        //second method
        WebElement searchButton = driver.findElement(By.name("submit_search"));
        searchButton.click();
        //get the total number of dresses
        List<WebElement> dressesByClass = driver.findElements(By.className("product_img_link"));
        System.out.println("Number of dresses found by using class name =" + dressesByClass.size());
        dressesByClass.get(0).click();

        WebElement addToCartButton = driver.findElement(By.id("add_to_cart"));
        addToCartButton.click();

        WebElement layerCart = driver.findElement(By.id("layer_cart"));
        layerCart.isDisplayed();

        WebElement contactUsPartialLink = driver.findElement(By.partialLinkText("Contact"));
        contactUsPartialLink.click();

        WebElement contactUsLink = driver.findElement(By.partialLinkText("Contact us"));
        contactUsLink.click();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getText());
        }
        driver.quit();
    }
}