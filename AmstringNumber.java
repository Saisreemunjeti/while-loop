package com.loops;

public class AmstringNumber {

		public void isArmStrong(int num) {
			if (num<0) {
				System.out.println("Invalid Number");
			}
			 int sum = 0;
			 int temp = num;
			 while (num!=0) {
				 int remainder= num%10;
				 sum+=remainder * remainder * remainder;
				 num/=10;
			 }
			 if (temp==sum) {
				 System.out.println(temp +  " " +"is an Armstrong Number");
			 }
			 else {
				 System.out.println(temp + " "  + "is not an Armstrong Number");
				 
			 }
			 
			 
		}
		public static void main (String [] args) {
			AmstringNumber obj = new AmstringNumber();
			obj.isArmStrong(341);
		}

}
