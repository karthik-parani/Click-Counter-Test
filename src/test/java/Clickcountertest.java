import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class Clickcountertest {

    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\paran\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://qaclickcounter.ccbp.tech/");

        WebElement clickmebutton = driver.findElement(By.cssSelector("button.button"));

        WebElement Spanele = driver.findElement(By.cssSelector("span[class *='counter']"));

        for(int i = 1 ; i <= 100 ; i++){
            clickmebutton.click();

            int intToString = Integer.parseInt(Spanele.getText());

            if(intToString != i){
                System.out.println("Count Mismatch");
                break;

            }

            if(intToString == i){
                System.out.println("Click Counter App: Working as expected");
            }
        }

        driver.quit();
    }

}
