import org.openqa.selenium.By;
import org.openqa.selenium.Keys;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;



import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.support.ui.Select;



public class Assign2sol {



public static void main(String[] args) {



// TODO Auto-generated method stub


	System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver.exe") ;


WebDriver driver=new ChromeDriver();



driver.get("http://www.cleartrip.com/");

//calendar

driver.findElement(By.id("DepartDate")).click();



driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();

//DD1

WebElement adult=driver.findElement(By.id("Adults"));



Select s =new Select(adult);



s.selectByIndex(2);

//DD2



WebElement ch=driver.findElement(By.id("Childrens"));



Select s1 =new Select(ch);



s1.selectByIndex(2);



driver.findElement(By.xpath("//a[@title='More search options']")).click();



driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");



driver.findElement(By.id("SearchBtn")).click();

//validate error message

System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());



}



}