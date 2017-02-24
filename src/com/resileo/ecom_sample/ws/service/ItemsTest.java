package com.resileo.ecom_sample.ws.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ItemsTest extends Items{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetItemStatus() {
		assertTrue("Passed",getItemStatus("123").equals("E2000-Invalid ItemCode"));
	}

	@Test
	public void testGetItemPrice() {
		assertTrue("Passed",getItemPrice("123").equals("E2100-Invalid ItemCode"));
	}

}
