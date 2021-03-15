package baitaptet;
import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age,year;
		String name, ageGroup;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao ten: ");
		name = scanner.nextLine();
		System.out.print("nhap vao nam sinh : ");
		year = scanner.nextInt();
		//xac dinh do tuoi tuong ung
		age = 2021 - year;// 2021 la nam hien tai
		if(age<16) {
			ageGroup =" tuoi vi thanh nien";
		}
		else if (age >= 16 || age < 18) {
			ageGroup =" tuoi truong thanh";
		}
		else 
			ageGroup =" ban gia oy";
		
		System.out.println("ban "  +   name +   ageGroup );
	}

}

