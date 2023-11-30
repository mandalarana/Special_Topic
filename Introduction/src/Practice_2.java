import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
public class Practice_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/ranap/Downloads/chromedriver-win64/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
	Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name='name']")).click();
	
		
		//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John")
		 
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Ranaprathap");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rana@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("qqqqqqqqq");
		
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select abc = new Select(dropdown);
		abc.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("02/02/1992");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());


}
}