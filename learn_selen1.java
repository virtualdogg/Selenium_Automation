import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learn_selen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create Webdriver object
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver.exe") ;
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");//URL you want to hit
		System.out.println(driver.getTitle());//Get the page title
		System.out.print(driver.getCurrentUrl());//Validate if you land on the desired site
		
		//to get the page source specially for the sites where "View page source" option is disabled
		
		//System.out.println(driver.getPageSource());
driver.get("https://www.w3schools.com/");
//Use the back navigate button
driver.navigate().back();
		driver.close();//close the current browser
		driver.quit(); //close all the browser opened by selenium
		
	}

}
