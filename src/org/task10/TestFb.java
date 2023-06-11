package org.task10;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestFb {

	public static  void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANJU\\eclipse-workspace\\SeleniumTask10\\Chrome113\\chromedriver.exe");
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opts);
		driver.get(" https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),' share with ')]"));
		String text2 = text.getText();
		System.out.println(text2);
	
	
	}	
}
