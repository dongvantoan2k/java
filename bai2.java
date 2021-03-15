package baitaptet;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao so vcan kiem tra: ");
		int n;
		n = scanner.nextInt();
		if(n/2==0) {
			System.out.println(n+ " la so chan");
		}
		else {
			System.out.println(n+ " la so le");
		}
	}

}
