package com.example.demo.Exception;

public class Customexception extends RuntimeException{
	
	String message ;
	
	public Customexception(String message)
	{
		this.message=message ;
	}

}
