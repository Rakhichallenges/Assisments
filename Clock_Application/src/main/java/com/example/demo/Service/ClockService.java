package com.example.demo.Service;

import org.springframework.stereotype.Service;
import com.example.demo.Config.AppConstant;
import com.example.demo.Exception.Customexception;
import com.example.demo.util.Utility;

@Service
public class ClockService {

	public String getTimeInword(String hours, String min, String sec) throws Exception, Customexception {

		Integer hour = 0, minute = 0, second = 0;
		if (hours != null) {
			hour = Integer.valueOf(hours);
		}
		if (min != null) {
			minute = Integer.valueOf(min);
		}
		if (sec != null) {
			second = Integer.valueOf(sec);
		}

		StringBuffer result = new StringBuffer();
		if (hour == 12) {
			result = result.append(AppConstant.MIDDAY);
		} else if (hour == 24) {
			result = result.append(AppConstant.MIDNIGHT);
		} else if (hour > 0 && second > 0 && minute > 0) {

			String h = Utility.getHours(hour);
			String m = Utility.getMinute(minute);
			String s = Utility.getSecond(second);
			result = result.append(h).append(" ").append(m).append(" ").append(s).append(" ").append(getSuffix(hour, minute, second));

		} else if (hour > 0 && second == 0 && minute == 0) {
			String h = Utility.getHours(hour);
			result = result.append(h).append(" ").append(getSuffix(hour, minute, second));
		} else if (hour > 0 && second == 0 && minute > 0) {
			String h = Utility.getHours(hour);
			String m = Utility.getMinute(minute);
			result = result.append(h).append(" ").append(m).append(" ").append(getSuffix(hour, minute, second));
		}
		return result.toString();
	}

	public static String getSuffix(Integer hours, Integer min, Integer sec) throws Exception {
		String suffix = null;
		if (hours != 0 && min == 0 && sec == 0)
			suffix = AppConstant.CLOCK;
		else if (hours < 12 && min > 0) {
			suffix = AppConstant.AM;
		}

		else if (hours >= 12 && min > 0) {
			suffix = AppConstant.PM;
		}
		return suffix;

	}
}
