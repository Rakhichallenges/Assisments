package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Exception.Customexception;
import com.example.demo.Service.ClockService;

@SpringBootTest
public class ClockServiceTest {
	
	 @Autowired
	 ClockService service ;
	 
	@Test
	public void testgetTimeInword() throws Customexception, Exception
	{
		String result = service.getTimeInword("12","0","0");
		
		String  expresult = "MidDay";
		
		assertEquals(expresult,result);
	}
	
	@Test
	public void testgetTimeInwordcase2() throws Customexception, Exception
	{
		String result = service.getTimeInword("24","0","0");
		
		String  expresult = "MidNight";
		
		assertEquals(expresult,result);
	}
	
	
	
	@Test
	public void testgetTimeInwordcase3() throws Customexception, Exception
	{
		String result = service.getTimeInword("9","5","10");
		
		String  expresult = "NineFiveTenAM";
		
		System.out.println(result);
		
		assertEquals(expresult,result);
	}
	
	
	@Test
	public void testgetTimeInwordcase4() throws Customexception, Exception
	{
		String result = service.getTimeInword("9","0","0");
		
		String  expresult = "NineO'clock";
		
		System.out.println(result);
		
		assertEquals(expresult,result);
	}
	


	

}
