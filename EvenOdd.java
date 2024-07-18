import java.lang.*;
import java.util.Scanner;
class EvenOdd{
	void evenOdd(double a){
		 double n=a;
		 if(n%2==0){
			System.out.print(n+" "+"is an even number"); 
		 }
		else
			System.out.print( n+" "+"is an odd number");  
	}
  }
class Emain{
	public static void main(String []arg){
		Scanner input=new Scanner(System.in);
		EvenOdd ref_EO=new EvenOdd();
		System.out.print("Enter a number to check that number is Even or Odd :  ");
		double number=input.nextDouble();
		//int number=(int)num;
		ref_EO.evenOdd(number);
	}
 }