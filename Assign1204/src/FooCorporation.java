
public class FooCorporation {
// using static just to make it accessible any where in the class
	static double minimumSalary = 8.0;// By default it is given as 8 hours
	static int maximumHours = 60;// By default assigned to maximum possible hours

	public static void main(String[] args) {

		salaryCalculator("Employee1", 35, 7.50);
		salaryCalculator("Employee2", 47, 8.20);
		salaryCalculator("Employee3", 73, 10.00);

	}

	public static void salaryCalculator(String name, int hoursWorked, double basepay) {// By making the minimumSalary
																						// and MaximumHours static
																						// before we don't need to pass
																						// them in the method here
		double salary = 0; // salary is assigned to o by default

		if ((hoursWorked > maximumHours) || (basepay < minimumSalary)) {// if either one is true then move further in
																		// this loop else exit from this loop
			System.out.println(name + "'s is Invalid result!");
		} else {
			if (hoursWorked > 40) {
				salary = basepay * 40 + 1.5 * basepay * (hoursWorked - 40);
			} else {
				salary = basepay * hoursWorked;
			}
			System.out.println("salary of " + name + " is " + salary);

		}
	}
}

//Employee1's is Invalid result!
//salary of Employee2 is 414.1
//Employee3's is Invalid result!
