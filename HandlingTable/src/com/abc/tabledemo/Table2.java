package com.abc.tabledemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url="https://datatables.net/extensions/select/examples/initialisation/simple.html";
		driver.get(url);
		List <WebElement> row=driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		int rsize=row.size();
		System.out.println("Total no. of rows "+rsize);
		for(int i=1;i<=rsize;i++)
		{
			WebElement name=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]"));
			
			System.out.println(name.getText());
		}

			
	}

}
