package com.slokam.automation.testscripts;

public class Sample3 {

	public static final String MONDAY = "Monday";
	public static final String TUESDAY = "Tuesday";
	public static final String WEDNESDAY = "Wednesday";
	public static final String THURSDAY = "Thursday";

	/*
	 * public void validateWeekDay(String weekday) {
	 * 
	 * if(weekday.equals("Sunday")) { System.out.println("Today is holiday"); }else
	 * if(weekday.equals(MONDAY)) { System.out.println("Monday is to goto office");
	 * }else if(weekday.equals(TUESDAY)) {
	 * System.out.println("Tuesday is working day"); }else
	 * if(weekday.equals(WEDNESDAY)) {
	 * System.out.println("Wednesday is mid of the week"); }else
	 * if(weekday.equals(THURSDAY)) {
	 * System.out.println("Thursday is to goto temple"); }else
	 * if(weekday.equals("Friday")) { System.out.println("Friday is party time");
	 * }else if(weekday.equals("Saturday")) {
	 * System.out.println("Saturday is to gotholiday"); }
	 * 
	 * }
	 */

	public void validateWeekDay(Week we) {
		if (we.equals(Week.SUNDAY)) {
			System.out.println("Today is holiday");
		} else if (we.equals(Week.MONDAY)) {
			System.out.println("Monday is to goto office");
		} else if (we.equals(Week.TUESDAY)) {
			System.out.println("Tuesday is working day");
		} else if (we.equals(Week.WEDNESDAY)) {
			System.out.println("Wednesday is mid of the week");
		} else if (we.equals(Week.THURSDAY)) {
			System.out.println("Thursday is to goto temple");
		} else if (we.equals(Week.FRIDAY)) {
			System.out.println("Friday is party time");
		} else if (we.equals(Week.SATURDAY)) {
			System.out.println("Saturday is to gotholiday");
		}
	}

	public void validateWeekDay1(Week we) {

		switch (we) {
		case SUNDAY:

			break;
		case MONDAY:
			
			break;
		case TUESDAY:

			break;
		case THURSDAY:

			break;
		case FRIDAY:

			break;
		case SATURDAY:

			break;

		default:
			break;
		}

		if (we.equals(Week.SUNDAY)) {
			System.out.println("Today is holiday");
		} else if (we.equals(Week.MONDAY)) {
			System.out.println("Monday is to goto office");
		} else if (we.equals(Week.TUESDAY)) {
			System.out.println("Tuesday is working day");
		} else if (we.equals(Week.WEDNESDAY)) {
			System.out.println("Wednesday is mid of the week");
		} else if (we.equals(Week.THURSDAY)) {
			System.out.println("Thursday is to goto temple");
		} else if (we.equals(Week.FRIDAY)) {
			System.out.println("Friday is party time");
		} else if (we.equals(Week.SATURDAY)) {
			System.out.println("Saturday is to gotholiday");
		}
	}

}
