package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Lakshmi");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("roshansmart0006@gmail.com");
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
        WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
        CompanyName.clear();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Optimum");
        WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
        FirstName.clear();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nikitha");
        driver.findElement(By.name("submitButton")).click();
        System.out.println(driver.getTitle());
        
	}

}
