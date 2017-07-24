package cn.bdqn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.bean.Student;

public class SpringTest {
	@Test
	public void test01() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		/*
		 * 获取容器给我们创建的Student对象 ioc的体现 本身由自身创建对象的过程，把创建对象的权利移交给了spring容器! IOC
		 * 控制反转
		 * 
		 * 之前 Student student=new Student(); 现在context.getBean("student");
		 * context容器来创建对象了
		 */
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}
}
