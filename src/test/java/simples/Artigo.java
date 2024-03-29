package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {
    String url;
    WebDriver driver;


    @Before
    public void iniciar(){
        url = "https://iterasys.com.br/";
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/89/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    @Test
    public void procurarArtigo(){
    driver.get(url);
//        driver.findElement(By.id("searchtext")).sendKeys("Mantis");
        driver.findElement(By.id("searchtext")).sendKeys(Keys.ENTER);
//        //driver.findElement(By.cssSelector("button.wvui-button")).click();
//        assertTrue(driver.getTitle().contains("Ovo de P�scoa"));


       //assertEquals("Ovo de P�scoa - Wikip�dia, a enciclop�dia livre", driver.getTitle());// que esta na guia ativa
        }

    @After
    public void finalizar(){
    driver.quit();
    }
}
