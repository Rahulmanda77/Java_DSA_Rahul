package com.codegnan;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
public class Local {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate local=LocalDate.now();
		System.out.println(local);
		LocalDate tmr=local.plusDays(1);
		LocalDate nextweek=local.plusWeeks(1);
		LocalDate nextmonth=local.plusMonths(1);
		LocalDate nextyear=local.plusYears(1);
		System.out.println(tmr);
		System.out.println(nextweek);
		System.out.println(nextmonth);
		System.out.println(nextyear);
		
		System.out.println("Date :"+ local);
		System.out.println("Month :"+local.getMonth());
		System.out.println("Year :"+local.getYear());
		System.out.println("Day :"+local.getDayOfWeek());
		
		LocalDate date=LocalDate.of(2004,9,20);
		

	}

}

