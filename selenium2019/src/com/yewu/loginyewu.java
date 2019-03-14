package com.yewu;

import com.page.loginpage;
import com.page.xinzengtikupage;
import com.util.util;

public class loginyewu extends util{
	//打开网址
	public void openur () {
		driver.get(url1);
	}
	
	public void login() throws InterruptedException {
    //声明页面元素类的变量
	loginpage page=new loginpage();
	
	
    //登录的操作
	page.username();
	page.pwd();
	page.LX();
	Thread.sleep(5000);
	page.DLan();
	
	
	

	

	}
}

