
class DateAndTime {
	static void main(String[] args) {
		Date date = new Date();
		// display time and date using toString()
		System.out.println(date.toString());

		Date date1 = new Date(100);
		// display time and date using toString()
		System.out.println(date1.toString());

		println("\nafter()");
		Date olddate = new Date("01/03/2022");
		Date newdate = new Date("01/04/2022");
		Date latestdate = new Date();
		System.out.println(olddate.after(newdate));
		System.out.println(latestdate.after(newdate));

		println("\nequals()");
		System.out.println(olddate.equals(newdate));
		System.out.println(latestdate.equals(newdate));

		println("\ncompareTo()");
		System.out.println(olddate.compareTo(newdate));
		System.out.println(latestdate.compareTo(newdate));

		println("\ntoString()");
		System.out.println(olddate.toString());
		System.out.println(newdate.toString());
		System.out.println(latestdate.toString());

		println("\nbefore()");
		System.out.println(olddate.before(newdate));
		System.out.println(olddate.before(latestdate));

		println("\ngetTime()")
		System.out.println(olddate.getTime());
		System.out.println(newdate.getTime());
		System.out.println(latestdate.getTime());

		println("\nsetTime()");
		olddate.setTime(10000);
		newdate.setTime(10000);
		latestdate.setTime(10000);
		System.out.println(olddate.toString());
		System.out.println(newdate.toString());
		System.out.println(latestdate.toString());
	}
}
