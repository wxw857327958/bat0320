package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.util.util;

public class xinzengtikupage extends util{
    
	/*
	 * 新增题库
	 */
	
	//点击提供题库管理 并进入新增题库
	public void tiku() {
		
		driver.switchTo().frame("menu");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/ul/li[1]/a")).click();
	}
	
	//进入新增题库中输入名称
	public void liebiao() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		driver.findElement(By.name("d_name")).sendKeys("开发");
	}
	
	//选择状态
	public void ZT() {
		Select a =new Select(driver.findElement(By.name("d_status")));
		a.selectByIndex(1); 
	}
	
	//提交按钮
	public void ANNIU() {
		
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
}
