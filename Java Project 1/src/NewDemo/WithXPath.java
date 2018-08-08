package NewDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithXPath {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neelakshi\\Paths\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver =new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("http://opensource.demo.orangehrmlive.com/");
		
		 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		 driver.findElement(By.xpath("//a[.='PIM']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Add Emp')]")).click();
		 driver.findElement(By.name("firstName")).sendKeys("Neelakshi");
		 driver.findElement(By.name("lastName")).sendKeys("Choudhury");
		 
		 WebElement loginCheckbox = driver.findElement(By.id("chkLogin"));
		 
		 if (loginCheckbox.isSelected()!=true) {
			 loginCheckbox.click();
		 }
		 
		 Thread.sleep(2000);
		 
		 if (loginCheckbox.isSelected()) {
			loginCheckbox.click();
		}
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("#btnSave")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Edit']")).click();
		 driver.findElement(By.xpath("//input[@name='personal[optGender]'][@value='2']")).click();
		 
		 
		 WebElement elmcountry = driver.findElement(By.id("personal_cmbNation"));
	     Select lstCountry = new Select(elmcountry);
	     lstCountry.selectByVisibleText("Indian");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.cssSelector("#btnSave")).click();
	     Thread.sleep(2000);
		 driver.quit();
	}

}
