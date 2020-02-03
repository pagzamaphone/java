package io.github.actions_examples.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {
	@Test
	public void testGreeting() {
		assertEquals("Hello", HelloWorld.getGreeting());
	}
	
	@Test
	public void testAudience() {
		assertEquals("World", HelloWorld.getAudience());
	}
}
