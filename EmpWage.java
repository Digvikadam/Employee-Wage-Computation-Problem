package com.bridgelabz;

import java.util.Random;
public class EmpWage {
	public static final int TOTAL_WORKING_DAYS = 20;
	public static final int WAGE_PER_HR = 20;
	public static final int FULL_TIME_WORK_HRS = 8;
	public static final int PART_TIME_WORK_HRS = 4;
	public static void main(String[] args) {
		Random rd = new Random();
		int empcheck = rd.nextInt(3);
		switch (empcheck) {
		case 1:
			System.out.println("Month Salary of FullTime Employee");
			System.out.println((FULL_TIME_WORK_HRS  *  WAGE_PER_HR) * TOTAL_WORKING_DAYS  );
			break;
		case 2:
			System.out.println("Month Salary of PartTime Employee");
			System.out.println( (PART_TIME_WORK_HRS  *  WAGE_PER_HR) * TOTAL_WORKING_DAYS  );
			break;
		default:
			System.out.println("Salary=0");
		
		}
	}
}



