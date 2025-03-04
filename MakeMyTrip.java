package makemytrippoc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));

		driver.findElement(By.xpath("(//div[@class='imageSlideContainer']//section//span)[1]")).click();

		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chBuses inactive']")).click();

		Actions act = new Actions(driver);

		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("chennai");
		
		Thread.sleep(2000);
		
		Robot bot = new Robot();
		
		bot.keyPress(KeyEvent.VK_DOWN);
		bot.keyRelease(KeyEvent.VK_DOWN);
		
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
		
		//driver.findElement(By.xpath("//span[text()='Chennai, Tamil Nadu']")).click();

		//driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("bengalore");
		
		Thread.sleep(2000);
		
		bot.keyPress(KeyEvent.VK_DOWN);
		bot.keyRelease(KeyEvent.VK_DOWN);
		
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);

		//driver.findElement(By.xpath("//span[text()='Bangalore, Karnataka']")).click();

	}
}
