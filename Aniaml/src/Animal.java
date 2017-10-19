import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Mammal m = new Mammal();
		m.canmove();
		Oviparous o = new Oviparous();
		o.canmove();
		
		Scanner input = new Scanner(System.in);
		
	    try {
	    	
	    	System.out.println("Enter 1st value");
	    	int a = input.nextInt();
	    	System.out.println("Enter 2nd value");
	    	int b = input.nextInt();
	    	int d=a/b;
	    	System.out.println("division ans");
	    	System.out.println(d);
	    	System.out.println("well done");
	        
	    }
	    catch(Exception e) {
	          
	    	System.out.println("error");
	          
	    }
	
	}
	
}