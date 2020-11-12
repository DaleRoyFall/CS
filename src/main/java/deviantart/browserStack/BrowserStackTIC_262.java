package deviantart.browserStack;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackTIC_262 {
    public static final String USERNAME = "daleroyfall1";
    public static final String AUTOMATE_KEY = "xTof8xDa94yi5LifPNqP";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    private static WebDriver driver;

    public static void main(String[] args) throws Exception {
        launch_chrome_browser();
        open_loving_hermann_com_login_page();
        press_on_contacts_button();
        enter_name_password_and_confirm_password();
        press_on_SIGN_UP_button();
        close_the_browser();
    }

    public static void launch_chrome_browser() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "80");

        caps.setCapability("name", "TIC-262");

        System.setProperty("webdriver.Chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

        driver = new RemoteWebDriver(new URL(URL), caps);
    }

    public static void open_loving_hermann_com_login_page() {
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html#");
    }

    public static void press_on_contacts_button() {
        WebElement singUpButton = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        singUpButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void enter_name_password_and_confirm_password() {
        WebElement nameInput = driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[1]/input"));
        nameInput.sendKeys("DaleRoyFall");
        WebElement emailInput = driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[2]/input"));
        emailInput.sendKeys("complete079@gmail.com");
        WebElement subjectInput = driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[3]/input"));
        subjectInput.sendKeys("Lost product");
        WebElement messageInput = driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/div[4]/textarea"));
        messageInput.sendKeys("My product is lost.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void press_on_SIGN_UP_button() {
        WebElement sendButton = driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/input"));
        sendButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void close_the_browser() {
        driver.quit();
    }
}
