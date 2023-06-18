package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Service.ClockService;

@SpringBootTest
public class ControllerTest {
	 
	 @Autowired
     ClockService service ;
	
	 @Test
	public void testgetTimeInword()
		{
			
		 
		}

}
