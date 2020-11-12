package deviantart.browserStack;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackTIC_250 {
    public static final String USERNAME = "daleroyfall1";
    public static final String AUTOMATE_KEY = "xTof8xDa94yi5LifPNqP";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    private static WebDriver driver;

    public static void main(String[] args) throws Exception {
        launch_chrome_browser();
        open_loving_hermann_com_login_page();
        open_clothing_menu();
        press_on_ADD_TO_CARD_button_multiple_times();
        close_the_browser();
    }

    public static void launch_chrome_browser() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "80");

        caps.setCapability("name", "TIC-250");

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

    public static void press_on_ADD_TO_CARD_button_multiple_times() {
        WebElement frstProductButton = driver.findElement(By.xpath("/html/body/div[7]/div/div[4]/div[1]/div/div[2]/div[2]/form/fieldset/input[10]"));
        frstProductButton.click();
        WebElement scndProductButton = driver.findElement(By.xpath("/html/body/div[7]/div/div[4]/div[2]/div/div[2]/div[2]/form/fieldset/input[10]"));
        scndProductButton.click();
        WebElement thrdProductButton = driver.findElement(By.xpath("/html/body/div[7]/div/div[4]/div[3]/div/div[2]/div[2]/form/fieldset/input[10]"));
        thrdProductButton.click();
        WebElement ffthProductButton = driver.findElement(By.xpath("/html/body/div[7]/div/div[4]/div[4]/div/div[2]/div[2]/form/fieldset/input[10]"));
        ffthProductButton.click();
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
