import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium webdriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String s =driver.findElement(By.xpath("//label[@for='benz']")).getText();
		driver.findElement(By.id("dropdown-class-example")).click();
		Select objSelect =new Select(driver.findElement(By.id("dropdown-class-example")));
		objSelect.selectByVisibleText(s);
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(s);
		
		driver.findElement(By.id("alertbtn")).click();
		String d = driver.switchTo().alert().getText().split("Hello ")[1].trim().split(",")[0].trim();
		System.out.println(d.length());
		System.out.println(s.length());
		if(s.equals(d))
		{
			System.out.println("TEXT matching");
		

	}
		else
		{System.out.println("NOT MATCHING");
		}
		}

}

