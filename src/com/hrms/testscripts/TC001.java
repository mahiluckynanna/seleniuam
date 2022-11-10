package com.hrms.testscripts;


	import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

	public class TC001 {
		General obj;
	//public static void main(String args[]) {
	   //Test Steps
		@Test
		public void login() {
			DOMConfigurator.configure("log4j.xml");
	 obj = new General();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
	}
	}

