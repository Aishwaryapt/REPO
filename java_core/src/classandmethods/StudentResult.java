package classandmethods;
import java.util.Scanner;

//instance class
class student {
	int rollno;
	String name ;
	int maths ,hindi,kannada;
	
//instance methods
void Display() {
	System.out.println("rollno="+rollno);
	System.out.println("name="+name);
	System.out.println("mathsmarks="+maths);
	System.out.println("hindimarks="+hindi);
	System.out.println("kannadamarks="+kannada);

}
void getInfo() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your roll no");
	rollno=sc.nextInt();
	System.out.println("enter your name");
	name=sc.next();
	System.out.println("enter maths marks");
	maths=sc.nextInt();
	System.out.println("Enter hindi marks");
	hindi=sc.nextInt();
	System.out.println("enter kannada marks");
	kannada=sc.nextInt();
	
	
}
}




public class StudentResult {

	public static void main(String[] args) {
		student obj1=new student();
		System.out.println(obj1);
		student obj2=new student();
		System.out.println(obj2);
		System.out.println("please provide information about student1");
		obj1.getInfo();
		System.out.println("please provide information about student2");
		obj2.getInfo();
		obj1.Display();
		obj2.Display();
		}

}
