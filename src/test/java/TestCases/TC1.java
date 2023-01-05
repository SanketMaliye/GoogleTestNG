package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class TC1 extends  BaseClass {

	@Test
	public void TestCase_1() {
		
       String name="Gmail";
		
		String text=driver.findElement(By.xpath("//a[text()=\"Gmail\"]")).getText();
		if(name.equals(text))
		{
			System.out.println("Test Pass.");
		}
		else {
			System.out.println("Test Fail.");
		}
	}
}
