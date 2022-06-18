package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class ReRun implements IRetryAnalyzer,IAnnotationTransformer{
int min = 0; int max =3;
	@Override
	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}
	@Override
	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
	
		
		a.setRetryAnalyzer(ReRun.class);
	
	}

}
