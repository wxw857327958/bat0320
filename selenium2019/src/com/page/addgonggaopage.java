package com.page;

import org.openqa.selenium.By;

import com.util.util;

	public class addgonggaopage extends util{
		/*
		 * ���ѧ������������������
		 */
	   public void gonggao1 () {
		   
		   driver.switchTo().frame("menu");
		   driver.findElement(By.xpath("/html/body/div[1]/div[2]/h2/a")).click();
		   driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a")).click();
	   }
	   
	   //��������������
	   public void gonggao2 () {
	   driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[1]")).click();
	}
	   
	   //����������� 
	   public void gonggao3 () {
		   driver.findElement(By.name("c_name")).sendKeys("�ż�֪ͨ");
	   }
	   
	   //����ύ��ť
	   public void gonggao4 () {
		   driver.findElement(By.xpath("//*[@id=\"form_category_add\"]/table/tfoot/tr/td/button[1]")).click();
	   }
	}


