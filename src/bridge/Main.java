package bridge;

import bridge.function.CountDisplay;
import bridge.function.Display;
import bridge.impl.StringDisplayImpl;

/**
 * Bridge패턴 : 두 장소를 연결하는 역할 --> 기능의 클래스 계층과 구현의 클래스 계층
 * 예) 상위클래스 : 기본적인기능 / 하위클래스 : 새로운 기능을 추가 --> '기능의 클래스 계층'
 * 예) 상위클래스 : 추상 메소드에 의해 인터페이스(API)를 규정 / 하위클래스 : 구상 메소드에 의해 그 인터페이스(API)를 구현 --> '구현의 클래스 계층'
 * 만약 클래스 계층이 하나라면 기능의 클래스 계층과 구현의 클래스 계층이 하나의 계층구조 안에서 혼재하게 됩니다. 
 * 이를 해결하기 위해 두개의 클래스 계층 사이에 다리를 놓는 패턴이 Bridge패턴
 * @author skplanet
 *
 */
public class Main {
	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("Hello, Korea"));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
		
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
	}
}
