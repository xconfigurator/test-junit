package cn.edu.tju.test_junit;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

/**
 * 演示JUnit 4常用注解
 * @author liuyang
 *
 */
public class AnnotationTest {
	
	/**
	 *声明的异常将被忽略 
	 */
	@Test(expected=ArithmeticException.class)
	public void divide() {
		assertEquals(3, new Calculate().divide(6, 0));// @Test(expected=ArithmeticException.class) 是 Green Bar
	}
	
	/**
	 * 超时计时
	 */
	@Test(timeout=3000)
	public void testWhile() {
		while(true) ;
	}
	
	/**
	 * 忽略
	 */
	@Ignore("这里可以说明忽略执行的原因！")
	@Test
	public void testWhile2() {
		while(true) ;
	}
}
