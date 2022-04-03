package packageOne;
import java.util.Scanner;
public class Classone  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int m=23;
//int n=21;
//int result=m+n;
//System.out.println("Addition of numbers");
//System.out.println(+ result);
		int num1;
		int num2;
Scanner sc= new Scanner(System.in);
System.out.println("Enter first number");
num1= sc.nextInt();
System.out.println("Enetr second number");
num2= sc.nextInt();
System.out.println("Addition of two numbers" +(num1+num2));
System.out.println("Subtraction of two numbers" +(num1-num2));


}
}