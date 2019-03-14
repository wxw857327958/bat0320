package com.testcase;

import org.testng.annotations.Test;

import com.util.util;
import com.yewu.addclassyewu;
import com.yewu.loginyewu;
import com.yewu.xinzengyewu;

public class addclasstestcase extends util{
 @Test
 public void asclass () throws InterruptedException{
	 xinzengyewu q=new xinzengyewu();
		loginyewu w = new loginyewu();
		addclassyewu a=new addclassyewu();
		w.openur();//从loginyewu中调用打开网页
		w.login();//从loginyewu中调用登录页面
		
		q.tiku();//从xinzengyewu中调用题库管理
		
		a.aclass();
		
 }
}
