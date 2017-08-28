package cn.edu.tju.test_junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AnnotationTest.class, CalculateTest.class, ErrorAndFailureTest.class, JUnitFlowTest.class })
public class AllTests {
	
}
