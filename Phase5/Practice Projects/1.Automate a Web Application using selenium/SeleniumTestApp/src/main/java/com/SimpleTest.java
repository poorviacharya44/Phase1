package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\poorv\\Desktop\\Repository-Java\\Phase5\\Practice Projects\\1.Automate a Web Application using selenium\\chromedriver.exe");
	
       WebDriver driver=new ChromeDriver();
       System.out.println("Driver loaded successfully....");
       
       driver.get("C:\\Users\\poorv\\Desktop\\Repository-Java\\Phase5\\Practice Projects\\1.Automate a Web Application using selenium\\register.html");
	
	}

}
