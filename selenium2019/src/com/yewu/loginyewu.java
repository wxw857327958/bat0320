package com.yewu;

import com.page.loginpage;
import com.page.xinzengtikupage;
import com.util.util;

public class loginyewu extends util{
	//����ַ
	public void openur () {
		driver.get(url1);
	}
	
	public void login() throws InterruptedException {
    //����ҳ��Ԫ����ı���
	loginpage page=new loginpage();
	
	
    //��¼�Ĳ���
	page.username();
	page.pwd();
	page.LX();
	Thread.sleep(5000);
	page.DLan();
	
	
	

	

	}
}

