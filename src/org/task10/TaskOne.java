package org.task10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TaskOne {
	public static  void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANJU\\eclipse-workspace\\SeleniumTask10\\Chrome113\\chromedriver.exe");
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opts);
		driver.get(" https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Actions a = new Actions(driver);
		Thread.sleep(8000);
		WebElement phone = driver.findElement(By.xpath("//span[text()='Unlocked Smartphone 6.7inch Cell Phone IP14pro "
				+ "2+16GB HD Full Screen Straight Talk Phone Dual Sim Unlocked Android Phones Boost Mobile Phone (Blue)']"));
		Thread.sleep(8000);
		a.contextClick(phone).perform();
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
