package com.testng;

import org.testng.annotations.Test;

public class Testng_Priority {

	@Test(priority = 1)
	public void aMethod() {
		System.out.println("A Method");
	}

	@Test(priority = 3)
	public void bMethod() {
		System.out.println("B Method");
	}

	@Test(priority = 2)
	public void dMethod() {
		System.out.println("D Method");
	}

	@Test(priority = 4)
	public void cMethod() {
		System.out.println("C Method");
	}

}
