package com.page;

import org.openqa.selenium.By;

import com.util.util;

public class addclasspage extends util{
	/*
	 * ���ѧ������������༶����
	 */
   public void studentguanli () {
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame("menu");
	   driver.findElement(By.xpath("/html/body/div/div[1]/h2/a")).click();
	   driver.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();
   }
   
   //��������༶
   public void adclass () {
   driver.switchTo().defaultContent();
	driver.switchTo().frame("main");
	driver.findElement(By.xpath("/html/body/div/div[2]/div/a[1]")).click();
}
   
   //����������� 
   public void name () {
	   driver.findElement(By.name("b_name")).sendKeys("java��");
   }
   
   //����ύ��ť
   public void tijiao () {
	   driver.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
   }
}
