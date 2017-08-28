package cn.edu.tju.test_junit;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class SpringTest {
	
	@Autowired
	private Date date;
	
	@Autowired
	@Qualifier("sessionFactoryMySQL")
	private SessionFactory sessionFactory;
	
	private Session session;
	
	@Before
	public void before() {
		session = sessionFactory.openSession();
		
	}
	
	@After
	public void after() {
		if (session != null) {
			session.close();
		}
	}
	
	@Test
	public void test() {
		System.out.println(date);// 测试Spring基本容器
		System.out.println(sessionFactory);//  测试Hibernate的SessionFactory是否初始化
	}

}
