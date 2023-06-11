package org.task10;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TaskThree {
	public static  void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANJU\\eclipse-workspace\\SeleniumTask10\\Chrome113\\chromedriver.exe");
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opts);
		driver.get(" https://www.homedepot.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("headerSearch")).sendKeys("celling fan");
		Thread.sleep(2000);
		driver.findElement(By.id("headerSearchButton")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("//span[text()='Merwry 52 in. "
				+ "Integrated LED Indoor Matte Black Ceiling Fan with Light Kit and Remote Control']")).click();
}
}