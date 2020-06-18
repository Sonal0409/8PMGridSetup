package testcases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import base.TestBase;

public class ClassC extends TestBase{
	
	@Test
	public void testcase3()
	{
		try {
			openBrowser("chrome");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("open chrome browser of class C");
	}

}


