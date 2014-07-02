package bridge.function;

import bridge.impl.DisplayImpl;

/**
 * Display 클래스에 기능을 추가한 것이 CountDisplay 클래스 입니다. 
 * Display 클래스는 '표시한다'는 기능밖에 없지만 CountDisplay클래스에서는 '지정횟수만큼 표시한다'는 기능을 추가하였습니다.
 * @author skplanet
 *
 */
public class CountDisplay extends Display {
	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}
	
	// times만큼 반복해서 표시한다. 
	public void multiDisplay(int times) {
		open();
		for(int i = 0; i < times; i++) {
			print();
		}
		close();
	}
}
