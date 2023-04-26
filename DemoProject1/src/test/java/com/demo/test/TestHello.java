/**
 * 
 */
package com.demo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author smitkuma
 *
 */
public class TestHello {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Testing SetUp");
	}

	/**
	 * @throws java.lang.Exception
	 */
	

	@Test
	public void test() {
		System.out.println("Testing Hello");
	}

}
