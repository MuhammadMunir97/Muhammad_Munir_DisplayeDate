package com.muhammad.modells;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class FormattedDate {
	private String weekDay;
	private String month;
	private int year;
	private int day;
	private int hour;
	private int min;
	
	
	Calendar  calendar = Calendar.getInstance();
	
	public FormattedDate() {
		TimeZone tz = TimeZone.getTimeZone("EST");
		calendar.setTimeZone(tz);;
		weekDay = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
		month = calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US);
		year = calendar.get(Calendar.YEAR);
		day = Calendar.DAY_OF_MONTH;
		hour = calendar.get(Calendar.HOUR);
		min = calendar.get(Calendar.MINUTE);
	}

	public String getWeekDay() {
		return weekDay;
	}

	public String getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public int getDay() {
		return day;
	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public String prefix() {
		String prefix = "PM";
		int com = calendar.get(Calendar.AM_PM);
		if(com == 0)
			return "AM";
		
		return prefix;
	}
	
	
}
// using the model to make a date object that is per the requirement
// after making this object pass it to the controller 
// the view can just simply view the object 
