package cn.edu.cuit.dubbox;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.cuit.dubbox.service.DemoService;

public class Consumer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // ��ȡԶ�̷������
        String hello = demoService.sayHello("world"); // ִ��Զ�̷���
        System.out.println( hello ); // ��ʾ���ý��

	}

}
