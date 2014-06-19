package singleton.practice;
/**
 * Singleton 패턴을 적용해서 인스턴스가 하나만 만들어지도록 한다.
 * @author skplanet
 *
 */
public class TicketMaker {
	private int ticket = 1000;
	private static TicketMaker ticketMaker= new TicketMaker();
	private TicketMaker() {
		System.out.println("인스턴스 생성");
	}
	public static TicketMaker getInstance() {
		return ticketMaker;
	}
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
