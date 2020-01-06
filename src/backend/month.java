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
	public Month monthattr;
	public Year yearattr;
	public ArrayList<Revenue> revsources = new ArrayList<Revenue>();
	public ArrayList<Spending> spensources = new ArrayList<Spending>();
	
	
	public month(int time) {
		String date = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);
		int month =  Integer.parseInt(date.substring(3, 5)) + 1;
		int year = Integer.parseInt(date.substring(0,4));
		
		if (time >= 0) {
			int monthtime = time % 12;
			int yeartime = (time - monthtime)/12;
			year += yeartime;
			if (monthtime + month >= 12) {
				year ++;
				month = monthtime + month - 12;
			} else {
				month += monthtime;
			}
			monthattr = Month.of(month);
			yearattr = Year.of(year);
		}else {
			int yeartime = 0;
			while (time < 0) {
				time += 12;
				yeartime -= 1;
			}
			int monthtime = time;
			year += yeartime;
			month = month + monthtime;
			monthattr = Month.of(month);
			yearattr = Year.of(year);
		}
	}
	
	public int getTotalRev() {
		int totalrev = 0;
		for (Revenue revenue : revsources) {
			totalrev += revenue.getAmount();
		}
		return totalrev;
	}
	
	public int getTotalSpen() {
		int totalspen = 0;
		for (Spending spending : spensources) {
			totalspen += spending.getAmount();
		}
		return totalspen;
	}
	
	public int getTotalBal() {
		int totalbal = this.getTotalRev() - this.getTotalSpen();
		return totalbal;
	}
}