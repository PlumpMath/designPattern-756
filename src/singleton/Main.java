package singleton;
/**
 * Singleton 클래스를 이용하는 클래스
 * Singleton 클래스의 getInstance 메소드를 사용해서, Singleton의 인스턴스를 얻음.
 * - 지정한 클래스의 인스턴스가 '절대로' 1개밖에 존재하지 않는 것을 보증하고 싶을때.. 사용
 * - 인스턴스가 1개밖에 존재하지 않는 것을 프로그램 상에서 표현하고 싶을 때
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
