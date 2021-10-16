package com.bridgelabz;

import java.util.Random;
public class EmpWage {
	public static void main(String[] args) {
		Random rd = new Random();
		int empcheck = rd.nextInt(2);
		int WAGE_PER_HR = 20;
		int WORK_HRS = 8;
		if(empcheck==1) {
			System.out.println("Employee is Present");
			System.out.println(WAGE_PER_HR * WORK_HRS);
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}



