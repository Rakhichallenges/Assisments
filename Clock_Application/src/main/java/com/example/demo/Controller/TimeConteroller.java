package com.example.demo.Controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.Customexception;
import com.example.demo.Service.ClockService;
import com.example.demo.model.Time;

@RestController
@RequestMapping("/time")
public class TimeConteroller {

	@Autowired
	ClockService service;

	/*
	 * @GetMapping("/convert") public String timeInword(@RequestParam("hour")
	 * Integer hour, @RequestParam("min") Integer min,
	 * 
	 * @RequestParam("sec") Integer sec) throws Exception,Customexception { return
	 * service.getTimeInword(hour, min, sec); }
	 */

	@GetMapping("/test")
	public String test(Time time) {
		return "Application is running";
	}
    /*time expected format "h:m:s"*/
	@GetMapping("/splitConverter")
	public String timeconverter(@RequestParam("time") String time) throws Exception, Customexception {
		String[] timesp = null;
		String words = null;
		if (time.contains(":")) {
			timesp = time.split(":");
		} else {
			throw new Customexception("Invalid formate");
		}
		if (timesp.length == 2) {
			words = service.getTimeInword(timesp[0], timesp[1], "0");
		} else if (timesp.length == 3) {
			words = service.getTimeInword(timesp[0], timesp[1], timesp[2]);
		}

		else {
			throw new Customexception("Invalid formate");
		}

		return words;
	}

}
