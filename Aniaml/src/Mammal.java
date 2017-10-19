
public class Mammal extends Animal {
	public void canmove() {
		System.out.println("Mammal");
		
		Land l = new Land();
		l.canmove();
		
		Water w = new Water();
		w.canmove();
	}

}