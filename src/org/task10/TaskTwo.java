package org.task10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TaskTwo {
	public static  void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANJU\\eclipse-workspace\\SeleniumTask10\\Chrome113\\chromedriver.exe");
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opts);
		driver.get(" https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputValEnter")).sendKeys("iphones 7");
		//Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(4000);
		WebElement firstphone = driver.findElement(By.xpath("//p[text()='Spectacular Ace - Black Silicon Soft cases Compatible For Apple iPhone 7 ( Pack of 1 )']"));
		String parentwindow = driver.getWindowHandle();
		Actions a = new Actions(driver);
		//Thread.sleep(8000);
		a.contextClick(firstphone).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//driver.switchTo().window("https://www.snapdeal.com/product/"
				//+ "spectacular-ace-black-silicon-soft/632250558936#bcrumbSearch:iphones%207");
		//String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> allwindow = driver.getWindowHandles();
		for(String eachwindow:allwindow) {
			if(!parentwindow.equals(eachwindow)) {
			driver.switchTo().window(eachwindow);
			}
			Thread.sleep(8000);
				WebElement price = driver.findElement(By.xpath("//span[@class='pdp-final-price']"));
				String text = price.getText();
				System.out.println(text);
			}
		}
}
