package com.testcase;

import org.testng.annotations.Test;

import com.util.util;
import com.yewu.loginyewu;
import com.yewu.xinzengyewu;

public class xinzengtestcase extends util{
	@Test
	public void ti() throws InterruptedException {
	xinzengyewu q=new xinzengyewu();
	loginyewu w = new loginyewu();
	w.openur();//��loginyewu�е��ô���ҳ
	w.login();//��loginyewu�е��õ�¼ҳ��
	q.tiku();//��xinzengyewu�е���������
	
	
}
}
