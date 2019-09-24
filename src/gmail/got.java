package gmail;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class got {
	public static WebDriver driver;
	static String URL = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	
	@Test(priority=1)
	public void launchbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Koothabiran\\eclipse-workspace\\autoit\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Reporter.log("application launched");
	}
	
	
	@Test(priority=2)
	
		public void login() throws InterruptedException
		{
		
		//enter email
		driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("koothabiran.s@sybrant.com");
		Thread.sleep(2000);
		
		//enter next button
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']")).click();
		Thread.sleep(8000);
		
		//enter passord
		driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("koothabiran123");
		Thread.sleep(2000);
		
		//enter next button
		driver.findElement(By.xpath("//*[@id=\'passwordNext\']/span")).click();
		Thread.sleep(4000);
		
		System.out.println("login sucessfully");
		
		Reporter.log("login sucess");
	}
	
	
	@Test(priority=3)
	public void mail() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//*[@id=\':ka\']/div/div")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\':pt\']")).sendKeys("koothabirans@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\':qr\']")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("D:\\Fileupload.exe");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		
		Reporter.log("mail sent successfully");
		
	}
}
