package br.com.jamesson;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.jamesson.soap.Test;


@Component
public class TestUtility {
	private Map<Integer,Test> testMap = new HashMap<Integer,Test>();
	public TestUtility(){
		Test s1 = new Test();
		s1.setTestCPF("3232323");
		s1.setTestId(123);
		s1.setTestname("Jamesson");
		s1.setTestRG("ABC");
		testMap.put(1, s1);
		Test s2 = new Test();
		s2.setTestCPF("12324343");
		s2.setTestId(1234);
		s2.setTestname("Meu nome é teste");
		s2.setTestRG("12324343");
		testMap.put(2, s2);
	}
	public Test getTest(int testId){
		return testMap.get(testId);
	}
}
