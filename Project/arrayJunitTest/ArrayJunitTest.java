package com.arrayJunitTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.arrayJunitMain.ArrayJunit;

public class ArrayJunitTest {
private ArrayJunit aj;
@Before
public void setUp() throws Exception {
	aj = new ArrayJunit();
}
@After
public void tearDown() throws Exception {
	aj = null;
}
@Test
public final void testAdd() {
	assertEquals(98, aj.largest());
}
}
