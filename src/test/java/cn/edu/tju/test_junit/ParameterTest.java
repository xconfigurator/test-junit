package cn.edu.tju.test_junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 演示参数化配置
 * @author liuyang
 *	
 */
@RunWith(Parameterized.class)
public class ParameterTest {
	int expected = 0;
	int input1 = 0;
	int input2 = 0;
	
	// 测试参数
	@Parameters
	public static Collection<Object[]> t() {
		return Arrays.asList(new Object[][] {
			{3 ,1, 2},
			{4, 2, 2}
		});
	}
	
	public ParameterTest(int expected, int input1, int input2) {
		this.expected = expected;
		this.input1 = input1;
		this.input2 = input2;
	}
	
	@Test
	public void testAdd() {
		assertEquals(expected, new Calculate().add(input1,  input2));
	}
}
