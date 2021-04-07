
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver.exe") ;
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("dfafsada");
		driver.findElement(By.cssSelector("[name='pw']")).sendKeys("PAPA IS COMing");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
		
	}

}
