package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.util.util;

public class loginpage extends util{

	/*
	 * 这是登录的页面
	 */
	
	//用户名的输入
	public void username() {
		driver.findElement(By.name("username")).sendKeys("hujianming");;	
	}
	
    //密码
	public void pwd() {
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");;
	}
	
	//类型
	public void LX() {
		Select a =new Select(driver.findElement(By.name("usertype")));
		a.selectByIndex(2); 
	}
	
	//登录按钮
	public void DLan() {
		driver.findElement(By.xpath("/html/body/div[1]/div/table/tbody/tr[5]/td/div/button[1]")).click();
	}
	
}
