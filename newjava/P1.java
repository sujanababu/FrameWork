package newjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1
{
	static
	{
		//sets path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}


	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}


}
