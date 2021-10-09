package Com.maven.Maven_first;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto_Oct21 {
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?");

		driver.manage().window().maximize();
		
		

		WebElement first = driver.findElement(By.xpath("//a[@class='login']"));
		first.click();

		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("ta");

		WebElement creat_acc = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		creat_acc.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement ratio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		ratio.click();

		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		name.sendKeys("Raguram");

		WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		last.sendKeys("G");

		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		pass.sendKeys("123456789");

		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select d = new Select(day);
		d.selectByValue("8");

		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select r = new Select(month);
		r.selectByValue("2");

		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select m = new Select(year);
		m.selectByValue("1987");

		WebElement check1 = driver.findElement(By.xpath("//input[@id='newsletter']"));
		check1.click();

		WebElement check2 = driver.findElement(By.xpath("//input[@id='optin']"));
		check2.click();

		WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		company.sendKeys("TCS");

		WebElement address = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		address.sendKeys("no12, manickamnagar,poonamalle");

		WebElement address2 = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		address2.sendKeys("manickamnagar");

		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		city.sendKeys("chennai");

		WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
		Select s = new Select(state);
		s.selectByValue("5");

		WebElement post = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		post.sendKeys("00000");

		WebElement country = driver.findElement(By.xpath("(//select[@class='form-control'])[5]"));
		// Select f = new Select(country);
		// f.selectByValue("United States");
		country.sendKeys("united");

		WebElement text = driver.findElement(By.xpath("(//textarea[@id='other'])[1]"));
		text.sendKeys("good");

		WebElement home = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		home.sendKeys("8608032904");

		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		mobile.sendKeys("9715903939");

		WebElement ad = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		ad.sendKeys("no12");

		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		submit.click();

		WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		women.click();

		WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));

		image.click();
		
		
		WebElement myframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(myframe);
		
        
        WebElement addtocart = driver.findElement(By.xpath("//button[@class='exclusive']"));
        addtocart.click();
        
        driver.switchTo().defaultContent();
        WebElement check = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
        check.click();
        
       
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        
		
		//TakesScreenshot shot = (TakesScreenshot) driver;

		//File src = shot.getScreenshotAs(OutputType.FILE);

		//File dest = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\sample_snap.png");

		//FileUtils.copyFile(src, dest);
		
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();

	}

}

	


