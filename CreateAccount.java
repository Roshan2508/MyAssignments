package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Roshan");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("2,00,000");
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select drop1=new Select(Industry);
		drop1.selectByVisibleText("Computer Software");
		WebElement OwnerShip = driver.findElement(By.name("ownershipEnumId"));
		Select drop2 = new Select(OwnerShip);
		drop2.selectByVisibleText("S-Corporation");
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select drop3 = new Select(Source);
		drop3.selectByValue("LEAD_EMPLOYEE");
		WebElement MarketCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select drop4 = new Select (MarketCampaign);
		drop4.selectByIndex(6);
		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop5 = new Select(State);
		drop5.selectByValue("TX");
		driver.findElement(By.xpath("(//input[contains(@id,'ext-gen')])[30]")).click();
		
		
		
		
		
		
		 

	}

}
