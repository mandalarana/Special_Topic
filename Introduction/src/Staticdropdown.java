import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:/Users/ranap/Downloads/chromedriver-win64/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		   WebElement dropdownelement = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
			
			Select dropdown = new Select(dropdownelement);
			
			
			dropdown.selectByIndex(2);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			//System.out.println(dropdown.selectByIndex(2));
			dropdown.selectByVisibleText("USD");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			//driver.findElement(By.id("//select[@id='ctl00_mainContent_DropDownListCurrency']/option[2]")).click();

			
		}

	
	}


