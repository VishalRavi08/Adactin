package com.testng;

import org.testng.annotations.Test;

public class Testng_TimeOut {
	
	@Test(timeOut = 3000)
	public void aMethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("A Method");
	}

	@Test
	public void bMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("B Method");
	}

	@Test
	public void cMethod() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("C Method");
	}

}
