package javawrapperclass;

public class Sample4 {
	public static void main(String[] args) {
		byte a=1;
		Byte bObj=Byte.valueOf(a);
		
		char b='a';
		Character cObj= Character.valueOf(b);
		
		int c=34;
		Integer iObj= Integer.valueOf(c);
		
		float d=15.5f;
		Float fObj= Float.valueOf(d);
		
		double e=56.6;
		Double dObj=Double.valueOf(e);
		
		System.out.println("printing as objects");
		System.out.println(bObj);
		System.out.println(cObj);
		System.out.println(iObj);
		System.out.println(fObj);
		System.out.println(dObj);
		
		byte bv=bObj;
		char cv=cObj;
		int iv=iObj;
		float fv=fObj;
		double dv=dObj;
		
		System.out.println("printing as data types");
		System.out.println(bv);
		System.out.println(cv);
		System.out.println(iv);
		System.out.println(fv);
		System.out.println(dv);
		
	}
}
