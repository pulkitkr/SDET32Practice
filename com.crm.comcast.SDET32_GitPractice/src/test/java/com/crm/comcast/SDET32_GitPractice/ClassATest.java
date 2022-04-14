package com.crm.comcast.SDET32_GitPractice;

import org.testng.annotations.Test;

public class ClassATest {

	@Test
	public void demoTest() {
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		
		System.out.println(browser);
		System.out.println(url);
		
		System.out.println("First Push");
		
		System.out.println("First changed Push for jenkins1");
		System.out.println("First changed Push for jenkins2");
		System.out.println("First changed Push for jenkin3");

		}
}
