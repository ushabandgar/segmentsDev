package segmentsDev;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://customerportal.birdzi.com/web/guest/home");
		System.out.println(driver.getTitle());
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/section/div/div/div/div/div[2]/form/fieldset/div/div/input")).sendKeys("ubandgar+tops@birdzi.com");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/section/div/div/div/div/div[2]/form/fieldset/div/div[2]/input")).sendKeys("Mydreamhouse@1");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/section/div/div/div/div/div[2]/form/div/button")).click();
		
		driver.navigate().to("https://customerportal2.birdzi.com/prod/nsstops.html");
		//driver.get("https://customerportal2.birdzi.com/prod/nsstops.html");
		driver.findElement(By.xpath("//button[@class=\"button\"]")).click();
	
		Set<String> win=driver.getWindowHandles();
		ArrayList ls=new ArrayList(win);
		
		for(int i=0;i<win.size();i++)
		{	
			String a=(String) ls.get(i);
			String	title=driver.switchTo().window(a).getCurrentUrl();
		if(title=="https://customerportal2.birdzi.com/prod/v1.58-1ac65f2ee63d8f3e964c1482b7ad1eddfac00400/segmentsnew?portalUserCompanyID=5662&portalUserContactID=9083")
		   {
			
			driver.switchTo().window(a);
			}
		}
	
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class=\"fun-btn\"]"))).click();
		//driver.switchTo().frame("intercom-frame");
	   // driver.findElement(By.xpath("//div[@class=\"ui-dialog ui-corner-all ui-widget ui-widget-content ui-front custom-dialog\"]/descendant::span[6]")).click();
		
		
		//intercom
		
		//driver.findElement(By.xpath("//div[@class=\"intercom-15k8kn8 e11rlguj3\"]")).click();
	   
		
		//driver.close();	
	
	}
}
