
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class case1_1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");  // (1)

        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver = new ChromeDriver(option);

        try {
            driver.get("https://taobao.com"); //(2)
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //driver.quit(); //(3)
        }
    }

}