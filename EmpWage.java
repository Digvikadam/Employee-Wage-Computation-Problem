package com.bridgelabz;

import java.util.Random;
public class EmpWage {
	public static final int WAGE_PER_HR = 20;
	public static final int FULL_TIME_WORK_HRS = 8;
	public static final int PART_TIME_WORK_HRS = 4;
	public static void main(String[] args) {
		Random rd = new Random();
		int empcheck = rd.nextInt(3);
		
		switch(empcheck) {
		case 1:
			System.out.println("Salary of Fulltime Employee");
			System.out.println( WAGE_PER_HR * FULL_TIME_WORK_HRS);
		break;
		case 2:
			System.out.println("Salary of Parttime Employee");
			System.out.println( WAGE_PER_HR * PART_TIME_WORK_HRS );
		break;
		default:
			System.out.println("Salary = 0");
		}
		
	}
}



