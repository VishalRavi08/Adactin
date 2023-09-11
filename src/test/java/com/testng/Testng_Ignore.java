package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Testng_Ignore {
	
	@Ignore
	@Test
	public void aMethod() {
		System.out.println("A Method");		
	}
	
	@Test(enabled = false)
	public void bMethod() {
		System.out.println("B Method");		
	}
	
	@Test
	public void cMethod() {
		System.out.println("C Method");		
	}
	
	@Test
	public void dMethod() {
		System.out.println("D Method");		
	}

}
 