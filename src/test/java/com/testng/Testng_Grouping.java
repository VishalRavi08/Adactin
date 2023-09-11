package com.testng;

import org.testng.annotations.Test;

public class Testng_Grouping {
	
	@Test(groups = "smoketest1")
	public void aMethod() {
		System.out.println("A Method");
	}

	@Test(groups = "smoketest2")
	public void bMethod() {
		System.out.println("B Method");
	}

	@Test(groups = "smoketest2")
	public void dMethod() {
		System.out.println("D Method");
	}

	@Test(groups = {"smoketest1", "smoketest2"})
	public void cMethod() {
		System.out.println("C Method");
	}

}
