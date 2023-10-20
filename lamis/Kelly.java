package lamis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kelly {

	public static void main(String[] args) {
	ChromeDriver e1= new ChromeDriver();
	    e1.get("https://www.google.com");
		e1.findElement(By.linkText("Gmail")).click();
		e1.get("http://www.amazon.in");
		e1.manage().window().maximize();
		e1.findElement(By.linkText("Mobiles")).click();
		e1.findElement(By.linkText("Customer Service")).click();
		e1.findElement(By.partialLinkText("Customer")).click();
		
		}

}
