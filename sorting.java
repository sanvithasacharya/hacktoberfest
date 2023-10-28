package PRACTICE;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n = userInput.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements: ");
		for(int i = 0; i < n; i++) {
			a[i] = userInput.nextInt();
			for(int j = i+1; j < n;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		System.out.println("Ascending order: ");
		for(int i = 0; i< n-1; i++) {
			System.out.println(a[i] + ",");
		}
		System.out.println(a[n-1]);
		}

	}
