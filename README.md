Here, I write a program that checked the given number is Even or Odd. We take the input by user using Scanner class. It is import from predefined library is "util" into java. 

## Code 
* EvenOdd
```
import java.lang.*;
import java.util.Scanner;
class EvenOdd{
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
```

A simple Java program to determine if a number is even or odd.

## Usage

* Compile the program using `javac EvenOdd.java`
* Run the program using `java Emain`

## Description

This program uses the modulo operator (`%`) to check if the input number is divisible by 2. If it is, the number is even. Otherwise, it's odd.

## Author

__UDVIP MAURYA__
