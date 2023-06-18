package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Exception.Customexception;
import com.example.demo.util.Utility;

@SpringBootTest
public class UtilityTest {
	
	
	@Test
	public void testgetHour() throws Customexception, Exception
	{
		String result = Utility.getHours(9);
		
		String  expresult = "Nine";
		
		assertEquals(expresult,result);
	}
	
	@Test
	public void testgetMin() throws Customexception, Exception
	{
		String result = Utility.getMinute(5);
		
		String  expresult = "Five";
		
		assertEquals(expresult,result);
	}
	
	@Test
	public void testgetSec() throws Customexception, Exception
	{
		String result = Utility.getSecond(10);
		
		String  expresult = "Ten";
		
		assertEquals(expresult,result);
	}

}
