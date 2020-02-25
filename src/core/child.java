package core;

public class child extends Hello{
	public void property() {
		System.out.println("My car...");
	}
	public static void main(String arg[]) {
		child c = new child();
		c.property();
		c.land();
		
	}
}
