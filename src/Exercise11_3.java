
public class Exercise11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		long starttime= System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			str+="a"; 
		}
		long endtime=System.currentTimeMillis();
		System.out.println("string time: " + (endtime -starttime)+ "ms");
		
		StringBuffer sbuffer= new StringBuffer();
		starttime= System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			sbuffer.append("a");
		}
		endtime=System.currentTimeMillis();
		System.out.println("stringbuffer time: " + (endtime -starttime)+ "ms");
		
		StringBuilder sbuilder =new StringBuilder();
		starttime= System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			sbuilder.append("a");
		}
		endtime=System.currentTimeMillis();
		System.out.println("stringbuilder time: " + (endtime -starttime)+ "ms");
		
	}

}
