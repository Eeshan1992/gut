package lamis;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class Vat {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver s1= new ChromeDriver();
		s1.get("https://www.amazon.in");
		  s1.get("file:///C:/Users/dell/Downloads/learningHTML1.html");
		  s1.findElement(By.xpath("((/html/body/form)[2]/input)[2]")).click(); 
		
	}

}
