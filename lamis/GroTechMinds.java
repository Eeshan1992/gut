package lamis;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class GroTechMinds {

	public static void main(String[] args ) {
		ChromeDriver g1= new ChromeDriver();
		g1.get("https://www.google.com");
		g1.get("https://grotechminds.com/");
		g1.manage().window().maximize();
		g1.findElement(By.linkText("Automate me")).click();
		g1.get("https://grotechminds.com/registration/");
		g1.findElement(By.name("your-name")).sendKeys("eeshanacharya");
		g1.findElement(By.name("email")).sendKeys("hello");
		g1.findElement(By.name("Password")).sendKeys("dddd");
		g1.findElement(By.name("text-397")).sendKeys("Eeshan");
		g1.findElement(By.name("text-398")).sendKeys("Acharya");
		g1.findElement(By.name("radio-45")).click();
	

	}

}
