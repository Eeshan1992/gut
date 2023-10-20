package lamis;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lami {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver d1= new ChromeDriver();
		d1.get("https://www.youtube.com");
		Thread.sleep(3000);
		
		System.out.println(d1.getWindowHandle());
		System.out.println(d1.getWindowHandles());
		System.out.println(d1.getTitle());
		d1.close(); 
		// d1.quit();
		  
		
		
		
		
		
	}

}
