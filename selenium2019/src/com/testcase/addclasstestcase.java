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
		w.openur();//��loginyewu�е��ô���ҳ
		w.login();//��loginyewu�е��õ�¼ҳ��
		
		q.tiku();//��xinzengyewu�е���������
		
		a.aclass();
		
 }
}
