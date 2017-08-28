package cn.edu.tju.test_junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 演示产生错误的两种情况
 * @author liuyang
 *
 */
public class ErrorAndFailureTest {
	
	@Test
	public void add() {
		//assertEquals(6, new Calculate().add(3, 3));
		assertEquals(5, new Calculate().add(3, 3));// Errors: 0, Failures: 1
	}
	
	@Test
	public void divide() {
		//assertEquals(3, new Calculate().divide(6, 2));
		assertEquals(3, new Calculate().divide(6, 0));// Errors: 1, Failures： 0
	}
}
