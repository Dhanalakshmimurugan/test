package week4.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanuchFaceBook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input [@name='firstname']")).sendKeys("DHANALAKSHMI");
		driver.findElement(By.xpath("//input [@name='lastname']")).sendKeys("MURUGAN");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9444687310");
		driver.findElement(By.id("password_step_input")).sendKeys("Dhana@2000");
		driver.findElement(By.xpath("//option[@value='14']")).click();
		driver.findElement(By.xpath("//option[text()='Jul']")).click();
		driver.findElement(By.xpath("//option[@value='2000']")).click();
		driver.findElement(By.className("//label[text()='Female']")).isEnabled();
		boolean isenable=true;
		driver.close();
		
	}

}
