package com.auto.hooks;


import com.auto.base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{

	@Before
	public static void initialize() {
		Base.SetUp();
	}
	
	@After
	public static void tearDown() {
		driver.close();
	}
	
}
