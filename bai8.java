package baitaptet;
import java.util.Scanner;
public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, tong=0;
		Scanner scanner= new Scanner (System.in);
		System.out.println("Nhap vao so nguyen: ");

		while (true) {
			n=scanner.nextInt();
			tong=tong+n;
			if(tong>100) {
				break;
			}
		}
		System.out.println("Tong la= " + tong);

	}

}
