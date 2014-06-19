package singleton;
/**
 * getInstance() : 유일한 인스턴스를 얻을 메소드
 * @author bumziki@sk.com
 *
 */
public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {
		System.out.println("인스턴스를 생성하였습니다.");
	}
	public static Singleton getInstance() {
		return singleton;
	}
}

