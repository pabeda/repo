import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class SeleniumTest {

    @Test

    public void startWebDriver() {

        WebDriver webDriver = new SafariDriver();

        webDriver.navigate().to("http://www.n11.com");

        webDriver.get("https://www.n11.com/giris-yap");
        webDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("zafer.coban@n11.com");

        webDriver.findElement(By.xpath("//*[@id='password']")).sendKeys("brk2001");
        webDriver.findElement(By.xpath("//form[@id='loginForm']//div[@id='loginButton']")).click();

        sleep(3000);

        webDriver.findElement(By.id("searchData")).sendKeys("samsung");

        webDriver.findElement(By.className("searchBtn")).click();
        sleep(9000);

        webDriver.findElement(By.xpath("//div[@class='pagination']/a[text()='2']")).click();
        sleep(10000);

        webDriver.findElement(By.xpath("//*[@id=\"p-54193467\"]/div[1]/a")).click();
        sleep(8000);

        webDriver.findElement(By.xpath("//*[@id=\"addToFavourites\"]")).click();
        sleep(8000);

        webDriver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[1]/div/a")).click();
        sleep(8000);


        webDriver.findElement(By.xpath("//*[@id=\"myNavigation\"]/li[3]/a")).click();
        sleep(8000);


        webDriver.findElement(By.xpath("//*[@id=\"watchList\"]/tbody/tr/td[7]/a")).click();
        sleep(8000);

        webDriver.findElement(By.xpath("//*[@id=\"header\"]/div/a/img")).click();
        sleep(18000);
        webDriver.close();
        webDriver.quit();


    }

    public void sleep(int miliSecond) {
        try {
            Thread.sleep(miliSecond);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



