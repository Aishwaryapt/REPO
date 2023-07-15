interface Greeting{
    void greet(String msg);
}

/*class Test implements Greeting{
    public void greet(String msg){
        System.out.println(ms);
    }
}*/
public class Main
{
	public static void main(String[] args) {
	//	Test t=new Test();
	Greeting t=(msg)-> System.out.println(msg);
    
		t.greet("Hello All");
	}
}
