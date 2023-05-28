package advancedSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {

		String baseUrl = "https://jqueryui.com/slider/";
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);

		driver.manage().window().maximize();
		List<WebElement> select = driver.findElements(By.xpath("/html/body"));

		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(select.get(0)).click(select.get(1)).build().perform();

		action.clickAndHold(select.get(1)).clickAndHold(select.get(2)).build().perform();

		// slider
//
//		WebElement slide = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
//		action.dragAndDropBy(slide, 12, 80);
	}

}
