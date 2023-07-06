package gcs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Travel 
{
  @Test
  public void Desk() throws Exception
  {
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://20.219.145.143/signin");
	  driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("GI2327",Keys.TAB,"@123#",Keys.ENTER);
	   driver.findElement(By.xpath("//div[text()='Home']"));
	   	/*Travel Request*/
	   driver.findElement(By.xpath("(//div[@Class='ant-menu-submenu-title'])[6]")).click();
	   driver.findElement(By.xpath("//a[@href='/travel_desk/request']")).click();
	   driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-link']")).click();
	   driver.findElement(By.xpath("//input[@class='ant-select-selection-search-input']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[contains(text(),'GCS HR Initiative')]")).click();
	   driver.findElement(By.xpath("(//div[@class='ant-form-item-control-input-content'])[2]"));
	   driver.findElement(By.xpath("(//input[@class='ant-input'])[1]"));
	   driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hyderabad");
	   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("USA");
	   driver.findElement(By.xpath("(//div[@class='ant-picker'])[1]"));
	   driver.findElement(By.xpath("(//div[@class='ant-picker-input'])[1]"));
	   driver.findElement(By.xpath("(//input[@placeholder='Select date'])[1]"));
	   driver.findElement(By.xpath("(//span[@class='anticon anticon-calendar'])[1]"));
	   driver.findElement(By.xpath("//input[@id='newTravelRequest_journeyDate']")).click();
	   driver.findElement(By.xpath("//div[normalize-space()='16']")).click();
	   driver.findElement(By.xpath(" //input[@id='newTravelRequest_returnJourneyDate']")).click();
	   driver.findElement(By.xpath("//html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]/span[1]")).click();
	   driver.findElement(By.xpath("//td[@title='2023-08-31']//div[@class='ant-picker-cell-inner'][normalize-space()='31']")).click();
	   driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9893416256");
	   driver.findElement(By.xpath("//textarea[@class='ant-input']")).sendKeys("On Site Project");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	 }
	
}

