package backend;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;


public class month {
	/*
	 * Create enums for month/year and an array list of revenue/spending classes for the month.
	 */
	Month monthattr;
	Year yearattr;
	ArrayList<Revenue> revsources = new ArrayList<Revenue>();
	ArrayList<Class<Spending>> spensources = new ArrayList<Class<Spending>>();
	
	
	public month() {
		String date = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(date);
		int month =  Integer.parseInt(date.substring(3, 5)) + 1;
		System.out.println(month);
		int year = Integer.parseInt(date.substring(0,4));
		monthattr = Month.of(month);
		yearattr = Year.of(year);
	}
	
	public int getTotalRev() {
		int totalrev = 0;
		for (Revenue revenue : revsources) {
			totalrev += revenue.getAmount();
		}
		return totalrev;
	}
}
