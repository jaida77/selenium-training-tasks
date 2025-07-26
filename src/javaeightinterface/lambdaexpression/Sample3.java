package javaeightinterface.lambdaexpression;

interface Calculate{
	int operation(int x, int y);
}
public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate add= ( x,  y) -> x + y;
		Calculate mul= ( x,  y) -> x * y;
		Calculate sub= ( x,  y) -> x - y;
		Calculate div= ( x,  y) -> x / y;
		
		System.out.println(add.operation(5, 6));
		System.out.println(mul.operation(6, 2));
		System.out.println(sub.operation(20, 5));
		System.out.println(div.operation(5, 2));
	}

}
