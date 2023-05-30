package advancedSelenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium_training\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");

		WebElement download = driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]/span[2]"));

		download.click();

		Thread.sleep(5000);
//C:\Users\mathi\Downloads

		File fileLocation = new File("C:\\Users\\mathi\\Downloads");
		File[] totalfiles = fileLocation.listFiles();

		for (File file : totalfiles) {

			if (file.getName().contains("data")) {

				System.out.println("File is download");
				break;
			}
		}

	}

}
