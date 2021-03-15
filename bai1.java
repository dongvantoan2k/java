package baitaptet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("Nhap so thu nhat: ");
		int firstNumber = scanner.nextInt();
		System.out.println("nhap so thu hai: ");
		int secondNumber = scanner.nextInt();
		
		int Tong = firstNumber + secondNumber ;
		System.out.println(firstNumber+ "+" + secondNumber + "="+ Tong);
		
		int Hieu = firstNumber - secondNumber ;
		System.out.println(firstNumber+"-"+ secondNumber +"="+ Hieu);
		
		int Tich = firstNumber * secondNumber ;
		System.out.println(firstNumber +"*"+ secondNumber +"="+ Tich);
		
		float Thuong = (float)firstNumber / secondNumber ;
		System.out.println(firstNumber +"/"+ secondNumber +"="+ decimalFormat.format(Thuong));
			
		int phanDu = firstNumber % secondNumber ;
		System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);
		// cac toan tu da hoc de so sanh hai so do
		System.out.println("Kết quả so sánh bằng 2 số " + firstNumber + " và " + secondNumber + " là " + (firstNumber == secondNumber));
                
        System.out.println("Kết quả so sánh không bằng 2 số " + firstNumber + " và " + secondNumber + " là " + (firstNumber != secondNumber));
                
        System.out.println("Kết quả so sánh lớn hơn 2 số " + firstNumber + " và " + secondNumber + " là " + (firstNumber > secondNumber));
                
        System.out.println("Kết quả so sánh lớn hơn hoặc bằng 2 số " + firstNumber + " và " + secondNumber + " là " + (firstNumber >= secondNumber));
                
        System.out.println("Kết quả so sánh nhỏ hơn 2 số " + firstNumber + " và " + secondNumber + " là " + (firstNumber < secondNumber));
                
        System.out.println("Kết quả so sánh nhỏ hơn hoặc bằng 2 số " + firstNumber + " và " + secondNumber + " là " + (firstNumber <= secondNumber));
                
    }
 }


