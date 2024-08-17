package chezubaseleniumassignmentpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartSearchbox {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@name='q']")).submit();
		
		
		
		
		
}

}
