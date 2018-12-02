package com.abc.tabledemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url="D:\\Selenium\\table.html";
		driver.navigate().to(url);
		
		List <WebElement> row=driver.findElements(By.xpath("//table[@id='tab1']/tbody/tr"));
		int rsize=row.size();
		System.out.println("Total no. of rows "+rsize);
		
		List<WebElement>col=driver.findElements(By.xpath("//table[@id='tab1']/tbody/tr[1]/td"));
		int rcol=col.size();
		System.out.println("Total no. of columns "+rcol);
	
		for(int i=1;i<=rsize;i++)
		{
			WebElement data=driver.findElement(By.xpath("//table[@id='tab1']/tbody/tr["+i+"]"));
			System.out.println(data.getText());
			
		}
		
		
		

	}

}
