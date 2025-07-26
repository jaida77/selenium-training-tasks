package javaoops.interfce;

interface Microphone {
	void volume();
}
public class Sample3 {
// creating an object to interface through Anonymous Inner Class(AIC)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Microphone obj=new Microphone() {
			@Override
			public void volume() {
				System.out.println("volume is high");
			}
		};
		obj.volume();
	}

}
