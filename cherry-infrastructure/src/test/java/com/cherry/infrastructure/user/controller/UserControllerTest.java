package com.cherry.infrastructure.user.controller;

import org.apache.log4j.Logger;
import org.junit.Test;

public class UserControllerTest{
	private static Logger logger = Logger.getLogger(UserControllerTest.class);

	@Test
	public void testGotoUserPage(){
//		fail("Not yet implemented");
		logger.info("----------start:goto user page");
		System.out.println(System.getProperty("catalina.home"));
		System.out.println(System.getProperty("catalina.base"));
		logger.info("----------end:goto user page");
	}

}
