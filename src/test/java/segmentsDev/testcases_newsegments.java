package segmentsDev;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcases_newsegments {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		//sign-in
		driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
		
		//registration
		
		driver.findElement(By.xpath("//input[@id=\"email_create\"]")).sendKeys("test123@gmail.com");
	    driver.findElement(By.xpath("//button[@class=\"btn btn-default button button-medium exclusive\"]")).click();
		
	    //
	    
	}
}
