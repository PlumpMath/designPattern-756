package singleton.practice;

public class Main {
	// TicketMaker
//	public static void main(String[] args) {	
//		System.out.println("Start.");
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i +" : "+ TicketMaker.getInstance().getNextTicketNumber());
//		}
//		System.out.println("End.");
//	}
	
	// Triple
	public static void main(String[] args) {
		System.out.println("Start.");
		for(int i = 0; i < 9; i++) {
			Triple triple = Triple.getInstance(i%3);
			System.out.println(i + ":" + triple);
		}
		System.out.println("End.");
	}
}
