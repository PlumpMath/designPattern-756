package singleton;
/**
 * Singleton 클래스르르 이용하는 클래스
 * Singleton 클래스의 getInstance 메소드를 사용해서, Singleton의 인스턴스를 얻음.
 * @author bumziki@sk.com
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Start.");
		// Singleton 인스턴스 가져오기.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		// Singleton 인스턴스 객체가 동일한지 확인 cheking whether obj1 = obj2 or not.
		if(obj1 == obj2) {
			System.out.println("obj1 is equal to obj2.");
		} else {
			System.out.println("obj1 is not equal to obj2.");
		}
		System.out.println("End.");
	}
}
