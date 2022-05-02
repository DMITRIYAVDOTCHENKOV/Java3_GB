package src.ru.avdotchenkov.lesson7;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class RunningTheTest {
	private static Object BeforeSuite;
	
	public static void main (String[] args)
			throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException {
		Class <?> MyClassTest = null;
		Class <?> myTestClass = null;
		src.ru.avdotchenkov.lesson7.MyClassTest objectTest = null;
		start(myTestClass, objectTest);
	}
	
	private static void start (Class <?> MestClass, MyClassTest myClass)
			throws InvocationTargetException, IllegalAccessException, RuntimeException, InstantiationException {
		Class myTestClass = MyClassTest.class;
		Object objectTest = myTestClass.newInstance();
		
		Method[] methods = myTestClass.getDeclaredMethods();
		ArrayList <Method> myTest = new ArrayList <>();
		Method beforeMethod = null;
		Method afterSuite = null;
		for (Method method : myTestClass.getDeclaredMethods()) {
			if (method.isAnnotationPresent(Test.class)) {
				myTest.add(method);
			}
			if (method.isAnnotationPresent(src.ru.avdotchenkov.lesson7.BeforeSuite.class)) {
				if (beforeMethod == null)
					beforeMethod = method;
			}
			if (method.isAnnotationPresent(AfterSuite.class)) {
				if (afterSuite == null)
					afterSuite = method;
			}
			myTest.sort(new Comparator <Method>() {
				@Override public int compare (Method o2, Method o1) {
					return o2.getAnnotation(Test.class).priority() - o1.getAnnotation(Test.class).priority();
				}
			});
		}
		StartTest(objectTest, myTest, beforeMethod, afterSuite);
	}
	
	private static void StartTest (Object objectTest, ArrayList <Method> myTest, Method beforeMethod, Method afterSuite)
			throws IllegalAccessException, InvocationTargetException {
		beforeMethod.invoke(objectTest, null);
		for (Method method : myTest)
			method.invoke(objectTest, null);
		if (afterSuite != null)
			
			afterSuite.invoke(objectTest, null);
		System.out.println("Все!");
	}
	
}





