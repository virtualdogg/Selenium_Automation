import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver.exe") ;
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("dasfad");
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("dasdasD");
	
		driver.findElement(By.cssSelector("input[title*='Sign in']")).click();
		
	
		
		
	}

}