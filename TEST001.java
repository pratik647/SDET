package sdettest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TEST001 {
	@Test
public void idmi() throws Exception{
	System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe\\"); 
	WebDriver Driver=new ChromeDriver();

	Driver.navigate().to("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
	Driver.manage().window().maximize();
	String release = Driver.findElement(By.xpath("/html/body/div[2]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[1]/div/ul/li/a")).getText();
System.out.println("Result:"+release);

String country = Driver.findElement(By.xpath("/html/body/div[2]/main/div/section[1]/div/section/div/div[1]/section[9]/div[2]/ul/li[2]/div/ul/li/a")).getText();
System.out.println("Result:"+country);

Thread.sleep(5000);
Driver.quit();


}
	@Test
	public void wiki() throws Exception{
		System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe\\"); 
		WebDriver Driver=new ChromeDriver();
		
		Driver.navigate().to("https://en.wikipedia.org/wiki/Pushpa%3A_The_Rise\";");
		Driver.manage().window().maximize();
		
		String release = Driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")).getText();
		System.out.println("Result:"+release);
		
		String country = Driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/td")).getText();
		System.out.println("Result:"+country);
		
		Thread.sleep(5000);
		Driver.quit();
	}

}
