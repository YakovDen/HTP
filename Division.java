package Division;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Division {
	static double d;
	public static double div(double a,double b){
		d = a / b;
		return d;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ������� a =");
		double a = sc.nextInt();
		System.out.print("������� �������� b =");
		double b = sc.nextInt();		
		div(a,b);		
		System.out.printf("������� �� ������� a/d =%.2f",+d);
		

	}

}
