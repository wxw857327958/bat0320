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

				w.openur();//��loginyewu�е��ô���ҳ
				w.login();//��loginyewu�е��õ�¼ҳ��
               
				a.gonggao5();
				
		 }
		}

