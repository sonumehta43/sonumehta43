package trstpro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class testone {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * System.out.println(sol());
	 * 
	 * //return result + r;
	 * 
	 * }
	 * 
	 * private static int sol() { // TODO Auto-generated method stub int [] A=
	 * {1,1,0,1,0,0}; int n = A.length; int result = 0; for (int i = 0; i < n - 1;
	 * i++) { if (A[i] == A[i + 1]) result = result + 1; } int r = 0; for (int i =
	 * 0; i < n; i++) { int count = 0; if (i > 0) { if (A[i - 1] != A[i]) count =
	 * count + 1; else count = count - 1; } if (i < n - 1) { if (A[i + 1] != A[i])
	 * count = count + 1; else count = count - 1; } r = Math.max(r, count); }
	 * 
	 * return result!=0?(result + r):result; }
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//String n=sc.next();
		//int am=sc.nextInt();
		if(a>18) {
			System.out.println("You are eligible");}
			if(a<18) {
				try {
					throw new AgeException("You are not eligible");
				}
				catch(AgeException Ae){
					System.out.println(Ae.getMessage());
					
				}
			}
		}
	
	}


