package com.abc.tabledemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url="https://datatables.net/extensions/select/examples/initialisation/simple.html";
		driver.get(url);
		
		List <WebElement>row=driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		int rsize=row.size();
		
		System.out.println("Total no. of rows "+rsize);
		int sum=0;
		for(int i=1;i<=rsize;i++)
		{
			WebElement salary=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[6]"));
			String text=salary.getText();
			System.out.println(text);
			text=text.replace("$","");
			text=text.replace(",","");
			sum=Integer.parseInt(text)+sum;
		}
		System.out.println("Total salary sum "+sum);
	}
}