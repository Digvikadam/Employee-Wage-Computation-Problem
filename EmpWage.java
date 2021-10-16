package com.bridgelabz;

import java.util.Random;
public class EmpWage {
	public static void main(String[] args) {
		Random rd = new Random();
		int empcheck = rd.nextInt(3);
		int WAGE_PER_HR = 20;
		int FULL_TIME_WORK_HRS = 8;
		int PART_TIME_WORK_HRS= 4;
		if(empcheck==1) {
			System.out.println("FullTime Wage");
			System.out.println( WAGE_PER_HR * FULL_TIME_WORK_HRS );
		}
		else if(empcheck==2) {
			System.out.println("PartTime Wage");
			System.out.println( WAGE_PER_HR * PART_TIME_WORK_HRS);
		}
		else {
			System.out.println("Salary = 0");
		}
	}
}



