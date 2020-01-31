package framework;

import org.testng.annotations.Test;

public class logginpage {

	@Test
	public <WebrDriver> void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\taant\\Downloads\\chromedriver.exe");
		WebrDriver driver=new ChromeDriver();
		driver.get("https://www.qvc.com/");
	}
	
	
	
}
