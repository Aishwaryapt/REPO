package Collectionexample;

class ConcatData<T>{
	
	T a,b;
	ConcatData(T a, T b){
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
}

public class GenericClassExample {
	public static void main(String[] args) {
		ConcatData<Integer> con=new ConcatData<>(4,5);
		con.display();
		ConcatData<Character> con1=new ConcatData<>('A','B');
		con1.display();
		ConcatData<String> con2=new ConcatData<>("Anu","Moni");
		con2.display();

	}

}



