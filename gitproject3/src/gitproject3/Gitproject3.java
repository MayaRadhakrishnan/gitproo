package gitproject3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gitproject3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("mayakrishnan@gamail.com");
		
		driver.findElement(By.name("pass")).sendKeys("maya2599");
		driver.findElement(By.name("login")).click();
		
	}

}
