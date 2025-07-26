package javaoops.inheritance;
//multi level 
class A2{
	int x=10;
}

class B2 extends A2{
	int y=30;
}

class C2 extends B2{
	int z= 20;
	void add() {
		int res;
		res= x+y+z;
		System.out.println(res);
	}
}
public class Sample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 obj = new C2();
		obj.add();
	}

}
