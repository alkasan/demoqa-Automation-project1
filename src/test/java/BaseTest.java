import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

   protected WebDriver driver;
   PracticeFormPage practiceFormPage;

    @BeforeAll
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe ");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        System.out.println("Test initiated");
        practiceFormPage = new PracticeFormPage(driver);
    }

    @AfterAll
    public  void tearDown(){
        // her şeyden sonra browser kapat
        driver.quit();
        System.out.println("Test finished");
    }
}
