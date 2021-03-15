package baitaptet;

import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum = 0, number;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("nhap vao 1 so: ");
			number = scanner.nextFloat();
			sum += number;
			System.out.println("tong hien tai la: " +sum);
		if (sum>100)
			break;
		}
		while (number>0);
		System.out.println("tong = " + sum);
		
	}
}

