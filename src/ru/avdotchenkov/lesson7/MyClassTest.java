package src.ru.avdotchenkov.lesson7;

import org.junit.jupiter.api.Order;

public class MyClassTest {
	
	
	public void method () {
		System.out.println("method");
	}
	
	@Test (priority = 1) public void test1 () {
		System.out.println("test2");
	}
	
	@Test (priority = 2) public void test2 () {
		System.out.println("test3");
		
	}
	
	@Test (priority = 3) public void test3 () {
		System.out.println("test4");
		
	}
	
	@Test (priority = 4) public void test4 () {
		System.out.println("test5");
		
	}
	
	@Test (priority = 5) public void test5 () {
		System.out.println("test6");
		
	}
	
	@Test (priority = 6) public void test6 () {
		System.out.println("test7");
		
	}
	
	@BeforeSuite
	
	public void beforeSuiteTest () {
		System.out.println("beforeSuiteTest");
		
	}
//	@BeforeSuite
//
//	public void beforeSuiteTest1 () {
//		System.out.println("beforeSuiteTest");
//
//	}
	
	@AfterSuite
	
	public void afterSuiteTest () {
		System.out.println("afterSuiteTest");
		
	}

}
