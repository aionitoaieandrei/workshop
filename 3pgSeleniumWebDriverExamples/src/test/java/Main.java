import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

        // Find element using Css selectors
        driver.get(pageUrl);
        WebElement signInLinkCss = driver.findElement(By.cssSelector("a[class='login']"));
//        WebElement signInLinkCss = driver.findElement(By.cssSelector("a[title='Log in to your customer account']"));
        signInLinkCss.click();

        WebElement emailAddressInputCss = driver.findElement(By.cssSelector("input[id='email']"));
        emailAddressInputCss.sendKeys("abcd");
        WebElement passwordInputCss = driver.findElement(By.cssSelector("input[type='password']"));
        passwordInputCss.sendKeys("password123");
        WebElement signInButtonCss = driver.findElement(By.cssSelector("button[name='SubmitLogin']"));
        signInButtonCss.click();

        WebElement errorMessageCss = driver.findElement(By.cssSelector("div[class='alert alert-danger']"));
        System.out.println("Next message is displayed for css example: " + errorMessageCss.getText());

        // Find element using xPath selectors
        driver.get(pageUrl);
        WebElement signInLinkXpath = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
//        WebElement signInLinkXpath = driver.findElement(By.xpath("//a[@class='login']"));
       // WebElement signInLinkXpath = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
        signInLinkXpath.click();

        WebElement emailAddressInputXpath = driver.findElement(By.xpath("//input[@id='email']"));
        emailAddressInputXpath.sendKeys("abcd");
        WebElement passwordInputXpath = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInputXpath.sendKeys("password123");
        WebElement signInButtonXpath = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
        signInButtonXpath.click();

        WebElement errorMessageXpath  = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        System.out.println("Next message is displayed for xpath example: " + errorMessageXpath.getText());

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Explicit wait
        WebDriverWait wait =new WebDriverWait(driver, 20);
        WebElement createAnAccountButton;
        createAnAccountButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[name='SubmitCreate']")));
        createAnAccountButton.click();

        // Fluent wait
//        Wait fluentWait = new FluentWait(driver)
//        .withTimeout(20)
//        .pollingEvery(4)
//        .ignoring(Exception.class);

        driver.quit();
    }
}
