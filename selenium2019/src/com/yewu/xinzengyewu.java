package com.yewu;

import com.page.xinzengtikupage;
import com.util.util;

public class xinzengyewu extends util{
	
	
	public void tiku() throws InterruptedException {
    //声明页面元素类的变量
		
		xinzengtikupage xinzeng=new xinzengtikupage();
		xinzeng.tiku();//使用题库管理
		xinzeng.liebiao();//使用新增题库中输入名称
		xinzeng.ZT();//使用状态
		xinzeng.ANNIU();//使用确定按钮
}
}