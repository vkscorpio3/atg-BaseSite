package com.sample.droplet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;

import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

import com.sample.ui.bean.test.MyAccountTest;
import com.sample.ui.bean.test.TestDemo;

/**
 * MyAccountDroplet.
 */
public class WeatherTestDroplet extends DynamoServlet {

	@Override
	public void service(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse)
			throws ServletException, IOException {

		logInfo(pRequest.getParameter("zipCode"));
		testDemo.setName(pRequest.getParameter("name"));
		testDemo.setAge(pRequest.getParameter("age"));
		testDemo.setRole(pRequest.getParameter("role"));

		TestDemo testDemo1 = new TestDemo();
		testDemo1.setName("Amit");
		testDemo1.setAge("30");
		testDemo1.setRole("Admin");

		myAccountTest.setDemoMap(new HashMap<String, TestDemo>());
		myAccountTest.getDemoMap().put(testDemo.getName(), testDemo);
		myAccountTest.getDemoMap().put(testDemo1.getName(), testDemo1);

		pRequest.setParameter("myAccount", testDemo);
		pRequest.setParameter("myAccountHash", myAccountTest);
		pRequest.serviceParameter("output", pRequest, pResponse);
		return;
	}

	public TestDemo testDemo;
	public MyAccountTest myAccountTest;

	public MyAccountTest getMyAccountTest() {
		return myAccountTest;
	}

	public void setMyAccountTest(MyAccountTest myAccountTest) {
		this.myAccountTest = myAccountTest;
	}

	public TestDemo getTestDemo() {
		return testDemo;
	}

	public void setTestDemo(TestDemo testDemo) {
		this.testDemo = testDemo;
	}
}