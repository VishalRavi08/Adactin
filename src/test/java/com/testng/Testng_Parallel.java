package com.testng;

import org.testng.annotations.Test;

public class Testng_Parallel {
	
	@Test
	public void aMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("A Method");
//		System.out.println("A Method");
//		System.out.println("A Method");
//		System.out.println("A Method");
	}

	@Test
	public void bMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("B Method");
	}

	@Test
	public void dMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("D Method");
	}

	@Test
	public void cMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("C Method");
	}

}
