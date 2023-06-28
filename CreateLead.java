package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bhimavarapu");
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1 = new Select (Source);
		drop1.selectByVisibleText("Employee");
		WebElement MarketCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2 = new Select (MarketCampaign);
		drop2.selectByValue("9001");
		WebElement OwnerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop3 = new Select (OwnerShip);
		drop3.selectByIndex(5);
		WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop4 = new Select (Country);
		drop4.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
	}

}
