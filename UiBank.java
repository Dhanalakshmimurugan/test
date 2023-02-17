package week4.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiBank {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("DHANALAKSHMI");
		driver.findElement(By.xpath("//option[text()='Ms']")).click();
		
		driver.findElement(By.id("middleName")).sendKeys("M");
		driver.findElement(By.id("lastName")).sendKeys("MURUGAN");
		driver.findElement(By.xpath("//option[text()='Female']")).click();
		driver.findElement(By.xpath("//option[text()='Unemployed']")).click();
		driver.findElement(By.id("username")).sendKeys("DHANA");
		driver.findElement( By.id("email")).sendKeys("dhana2000@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Dhana1407");
		Thread.sleep(2000);
		driver.close();
		
	}

}
