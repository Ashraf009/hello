package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
    
    public static void main(String[] args) {
    	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //driver.get("http://www.google.com/");
        //WebElement element = driver.findElement(By.name("q"));
        //element.sendKeys("mysql excel 2014");
        //element.submit();
    }


@Test
public void Test1()
{
	 Assert.assertEquals(10, 10);
}

@Test
public void Test2()
{
	 Assert.assertEquals(20, 10);
}

@Test
public void Test3()
{
	 Assert.assertEquals(10, 10);
}

}