package Basicconcepts;
import java.util.Scanner;


class Calculator {
	int num1,num2,ans;
	
	void getvalues() {
		Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st value");
num1=sc.nextInt()	;
System.out.println("enter 2nd value");
num2=sc.nextInt();
}
	int addition() {
		return  num1+num2;
	}
	int substraction() {
		return num1-num2;
		}
	int multiplication() {
		return num1*num2;
	}
	int division() {
		if (num2==0)
			return 0;
		else 
			return num1/num2;
		}
	int modulus() {
		return num1%num2 ;
	}
	
}



public class ArithmaticCaclulator {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		while(true) {
			
		
		System.out.println("Enter your choice 1.Add 2.SUb 3.Mult 4.divi 5.Mod  ");
		 choice=sc.nextInt();
		if(choice!=0)
			calc.getvalues();
			
		
		switch(choice){
		case 1 : System.out.println("sum="+calc.addition()); 
		break;
		case 2 : System.out.println("difference="+calc.substraction()); 
		break;
		case 3 : System.out.println("product="+calc.multiplication()); 
		break;
		case 4 : System.out.println("Questiont="+calc.division()); 
		break;
		case 5 : System.out.println("Remainder="+calc.modulus());
		break;
		default :System.out.println ("put a choice in between 1 to 5");
		}
		
		}	

	}

	}
