package javaeightinterface.lambdaexpression;

interface FunctionalInterface{
	void abstractFun(int x);
	default void function() {
		System.out.println("default function");
	}
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		lambda expression
		FunctionalInterface obj= (int x) ->  System.out.println(2*x);
		obj.abstractFun(5);
	}

}
