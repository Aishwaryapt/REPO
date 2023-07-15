package Basicconcepts;

public class TypeCasting {

	public static void main(String[] args) {
		byte num1 = 89;
		byte num2 = 90;
		byte ans=(byte) (num1 + num2);
		int result=num1+num2;
		System.out.println("Total="+result);
		
		
		//implicit data conversion
		int num3=6;
		float num4=9.8f;
		float sum=num3+num4;
		System.out.println("Total="+sum);
		

	}

}
