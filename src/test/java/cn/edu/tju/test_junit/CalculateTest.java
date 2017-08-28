package cn.edu.tju.test_junit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 演示最简单的测试类
 * @author liuyang
 *
 */
public class CalculateTest {

	@Test
	public void add() {
		assertEquals(6, new Calculate().add(3, 3));
	}

	@Test
	public void subtract() {
		assertEquals(3, new Calculate().subtract(5, 2));
	}
	
	@Test
	public void multiply() {
		assertEquals(4, new Calculate().multiply(2, 2));
	}
	
	@Test
	public void divide() {
		assertEquals(3, new Calculate().divide(6, 2));
	}
}
