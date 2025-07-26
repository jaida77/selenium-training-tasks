interface Printable { 
	void print(); 
}

interface Scannable { 
	void scan(); 
} 

class MultiFunctionPrinter implements Printable, Scannable { 
	public void print() { 
		System.out.println("printing"); 
	} 
	public void scan() { 
		System.out.println("scanning"); 
	} 
} 

public class ExerciseEXCEPTIONHANDLING2_3 { 
	public static void main(String[] args) { 
		MultiFunctionPrinter obj = new MultiFunctionPrinter(); 
		obj.print(); 
		obj.scan(); 
} 
} 
