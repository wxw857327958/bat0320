package com.testcase;

import org.testng.annotations.Test;

import com.util.util;
import com.yewu.addclassyewu;
import com.yewu.addgonggaoyewu;
import com.yewu.loginyewu;
import com.yewu.xinzengyewu;

public class addgonggaotestcase extends util{
		 @Test
		 public void asclass () throws InterruptedException{
			  addgonggaoyewu a=new addgonggaoyewu();
				loginyewu w = new loginyewu();

				w.openur();//从loginyewu中调用打开网页
				w.login();//从loginyewu中调用登录页面
               
				a.gonggao5();
				
		 }
		}

