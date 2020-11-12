package deviantart.browserStack;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackTIC_258 {
    public static final String USERNAME = "daleroyfall1";
    public static final String AUTOMATE_KEY = "xTof8xDa94yi5LifPNqP";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    private static WebDriver driver;

    public static void main(String[] args) throws Exception {
        launch_chrome_browser();
        open_loving_hermann_com_login_page();
        open_clothing_menu();
        click_on_product_quick_view();
        press_on_REVIEW_button();
        enter_name_email_and_review();
        press_on_SEND_button();
        close_the_browser();
    }

    public static void launch_chrome_browser() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "80");

        caps.setCapability("name", "TIC-258");

        System.setProperty("webdriver.Chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

        driver = new RemoteWebDriver(new URL(URL), caps);
    }

    public static void open_loving_hermann_com_login_page() {
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html#");
    }

    public static void open_clothing_menu() {
        WebElement menWearButton = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a"));
        menWearButton.click();
        WebElement clothingButton = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/ul/div/div[2]/ul/li/a"));
        clothingButton.click();
    }


    public static void click_on_product_quick_view() {
        Actions actions = new Actions(driver);
        actions. moveToElement(driver.findElement(By.xpath("/html/body/div[7]/div/div[4]/div[1]/div/div[1]/div/div"))).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement quickViewButton = driver.findElement(By.xpath("/html/body/div[7]/div/div[4]/div[1]/div/div[1]/div/div/a"));
        quickViewButton.click();
    }

    public static void press_on_REVIEW_button() {
        WebElement reviewButton = driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/ul/li[2]"));
        reviewButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void enter_name_email_and_review() {
        WebElement nameInput = driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div/div[2]/div/div/div[2]/form/input[1]"));
        nameInput.sendKeys("DaleRoyFall");
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div/div[2]/div/div/div[2]/form/input[2]"));
        emailInput.sendKeys("complete079@gmail.com");
        WebElement reviewInput = driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div/div[2]/div/div/div[2]/form/textarea"));
        reviewInput.sendKeys("Nice stuff");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void press_on_SEND_button() {
        WebElement sendButton = driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div/div[2]/div/div/div[2]/form/input[3]"));
        sendButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void close_the_browser() {
        driver.quit();
    }
}
