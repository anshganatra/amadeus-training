
import java.util.*;

public class DecisonMaking_Level2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employye Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Employee ID: ");
		int id = sc.nextInt();
		System.out.println("Monthly Basic Compensation: ");
		float basic = sc.nextFloat();
		System.out.println("Monthly Special Allowance: ");
		float specialAllowance = sc.nextFloat();
		System.out.println("Monthly tax saving investment: ");
		float taxSavingInvestments = sc.nextFloat();
		System.out.println("Bonus percentage: ");
		float bonus = sc.nextFloat();
		
		float grossMonthly = basic + specialAllowance;
		float annualSalary = 12 * grossMonthly;
		float grossAnnual = annualSalary * (1 + bonus/100);
		float taxableIncome = grossAnnual - ((12 * taxSavingInvestments) > 150000 ? 150000 : (12 * taxSavingInvestments));
		float tax = 0;
		
		if (taxableIncome < 250000) {
			tax = 0;
		} else if (taxableIncome < 500000) {
			tax = (float) ((taxableIncome - 250000) * 0.05);
		} else if (taxableIncome < 1000000) {
			tax = (float) (12500 + (taxableIncome - 500000) * 0.2);
		} else {
			tax = (float) (112500 + (taxableIncome - 1000000) * 0.3); 
		}
		
		System.out.println("--------------EMPLOYEE TAX DETAILS--------------");
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + id);
		System.out.println("Annual Gross Income: " +  grossAnnual);
		System.out.println("Annual Net (Post Tax Deduction): " + (grossAnnual - tax));
		System.out.println("Tax Payable: " + tax);
		sc.close();
	}

}
