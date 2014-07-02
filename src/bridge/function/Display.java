package bridge.function;

import bridge.impl.DisplayImpl;

/**
 * 기능 클래스 계층의 최상위 클래스 입니다. 
 * impl 필드는 Display클래스의 구현을 나태내는 인스턴스 입니다. 
 * 
 * @author skplanet
 *
 */
public class Display {
	private DisplayImpl impl;

	//생성자에는 구현을 나타내는 인스턴스를 전달합니다. 
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	//표시의 전처리
	public void open() {
		impl.rawOpen();
	}
	
	//표시 그 자체
	public void print() {
		impl.rawPrint();
	}
	
	//표시의 후처리
	public void close() {
		impl.rawClose();
	}
	
	public final void display() {
		open();
		print();
		close();
	}
}
