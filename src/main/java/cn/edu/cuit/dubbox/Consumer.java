package cn.edu.cuit.dubbox;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.cuit.dubbox.service.DemoService;

public class Consumer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果

	}

}
