package com.mindtree.seleniumclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class testingdemo {

	private static final CharSequence SPACE = null;
	private static final WebElement Keys = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/hovers']")).click();
		System.out.println(driver.findElement(By.xpath("//h5[text()='name: user1']")).getText());
		driver.navigate().back();
		//check boxes
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		//inputs
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='/inputs']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234");
		
		
		//dropdown
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
		Select s=new Select(driver.findElement(By.id("dropdown")));
		s.selectByValue("2");
		
		//File upload
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='/upload']")).click();
		//driver.findElement(By.xpath("//input[@id='file-upload']")).click();
		
		//tables
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='/tables']")).click();
		System.out.println(driver.findElement(By.xpath("//td[text()='Tim']")).getText());
		System.out.println(driver.findElement(By.xpath("//td[text()='Conway']")).getText());
		System.out.println(driver.findElement(By.xpath("//td[text()='tconway@earthlink.net']")).getText());
		System.out.println(driver.findElement(By.xpath("//td[text()='http://www.timconway.com']")).getText());
		
		
		//Key presses
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[@href='/key_presses']")).click();
		driver.findElement(By.xpath("//input[@id='target']")).click();
		driver.findElement(By.xpath("//input[@id='target']")).sendKeys("K");
		//Actions a=new Actions(driver);
		//WebElement move=driver.findElement(By.xpath("//input[@id='target']"));
		//driver.findElement(By.xpath("//input[@id='target']")).click();
		
		//a.moveToElement(driver.findElement(By.xpath("//input[@id='target']"))).click().keyDown(SPACE);
		
		
		//windows
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		//driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		//System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		
		
		//Contextmenu
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@href='/context_menu']")).click();
		driver.findElement(By.xpath("//div[@id='hot-spot']")).click();
		
		
		
		
	}

}
