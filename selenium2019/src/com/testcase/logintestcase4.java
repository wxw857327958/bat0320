package com.testcase;

import org.testng.annotations.Test;

import com.util.util;
import com.yewu.loginyewu;

public class logintestcase4 extends util{
@Test
public void login() throws InterruptedException {
	loginyewu yewu=new loginyewu();
	
	yewu.openur();
	yewu.login();
}
}
