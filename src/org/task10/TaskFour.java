package org.task10;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TaskFour {
	public static  void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANJU\\eclipse-workspace\\SeleniumTask10\\Chrome113\\chromedriver.exe");
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opts);
		driver.get(" http://www.greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("heading303")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']")).click();
		WebElement Text = driver.findElement(By.xpath("//pre[contains(text(),'QUESTION 1 ---------- ')]"));
		String text2 = Text.getText();
		System.out.println(text2);
}
}