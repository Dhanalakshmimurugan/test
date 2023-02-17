package week4.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LanuchMatrimony {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.tamilmatrimony.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.findElement(By.xpath("//option[@value='1']")).click();
	driver.findElement(By.id("NAME")).sendKeys("DHANALAKSHMI");
	
	WebElement radio1=driver.findElement(By.xpath("//input[@value='F']"));
	radio1.click();
	driver.findElement(By.xpath("//option[text()='14']")).click();
	driver.findElement(By.xpath("//option[text()='July']")).click();
	driver.findElement(By.xpath("//option[@value='2000']")).click();
	driver.findElement(By.xpath("//option[text()='Hindu']")).click();
	driver.findElement(By.xpath("//option[text()='Tamil']")).click();
	driver.findElement(By.xpath("//option[text()='India']")).click();
	driver.findElement(By.id("MOBILENO")).sendKeys("9444687310");
	driver.findElement(By.id("EMAIL")).sendKeys("dhanalakshmimurugan2000@gmail.com");
	Thread.sleep(2000);
	driver.close();
	
	
	
	
}
}
