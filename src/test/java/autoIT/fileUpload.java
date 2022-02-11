package autoIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;
@Test
public class fileUpload {

        public static void main(String[] args) throws InterruptedException, IOException {


            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.get("http://demo.automationtesting.in/Register.html");

            //Thread.sleep(2000);
       //driver.findElement(By.xpath ("/html/body/section/div/div/div[3]/div[2]/input")).click();

            Actions actions = new Actions(driver);

            WebElement uploadPhotoBtn = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div[2]/input"));
            actions.moveToElement(uploadPhotoBtn).click().perform();


            Runtime.getRuntime().exec("D:\\OneDrive - Constellation HomeBuilder Systems\\Desktop\\AutoIT\\Open.exe");


        }
    }





