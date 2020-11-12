package deviantart.featureImpl;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TIC_262 {
    private WebDriver driver;

    @Given("Launch Chrome browser TIC-262")
    public void launch_chrome_browser() {
        System.setProperty("webdriver.Chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @And("Open loving-hermann.com page TIC-262")
    public void open_loving_hermann_com_login_page() {
        driver.get("https://loving-hermann-e2094b.netlify.app/index.html#");
    }

    @Then("Press on ”Contacts” button")
    public void press_on_contacts_button() {
        WebElement singUpButton = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a"));
        singUpButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("Enter name, email, subject and message on Contact Form")
    public void enter_name_password_and_confirm_password() {
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

    @And("Press on SEND button TIC-262")
    public void press_on_SIGN_UP_button() {
        WebElement sendButton = driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/div[2]/form/input"));
        sendButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("Close the browser TIC-262")
    public void close_the_browser() {
        driver.close();
    }
}
