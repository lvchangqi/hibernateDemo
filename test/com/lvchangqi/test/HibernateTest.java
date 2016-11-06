package com.lvchangqi.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lvchangqi.pojo.User;

public class HibernateTest {

	SessionFactory factory = null;
	Session session = null;
	

	@Before
	@SuppressWarnings("resource")
	public void before(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:config/spring-ioc.xml","classpath:config/spring-mvc.xml");
		factory = ac.getBean(SessionFactory.class);
	}
	
	@After
	public void after(){
		session.close();
		factory.close();
	}
	
	@Test
	public void test() {
		session = factory.openSession();
		Transaction tra = session.beginTransaction();
		User user = new User();
		session.get(user.getClass(),3);
		tra.commit();
	}

}
