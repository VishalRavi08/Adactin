package com.testng;

import org.testng.annotations.Test;

public class Testng_DependensOn {
	
	@Test
	public void aMethod() {
		int a=5/0;
		System.out.println("A Method");
	}

	@Test(dependsOnMethods = "cMethod")
	public void bMethod() {
		System.out.println("B Method");
	}

	@Test(dependsOnMethods = "dMethod" )
	public void cMethod() {
		System.out.println("C Method");
	}

	@Test(dependsOnMethods = "aMethod")
	public void dMethod() {
		System.out.println("D Method");
	}

}
