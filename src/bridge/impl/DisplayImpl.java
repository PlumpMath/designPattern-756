package bridge.impl;
/**
 * 구현 클래스 계층의 최상위 계층
 * Display 클래스 open, print, close에 각각 대응하며 전처리, 표시, 후처리를 실행
 * @author skplanet
 *
 */
public abstract class DisplayImpl {
	public abstract void rawOpen();
	public abstract void rawPrint();
	public abstract void rawClose();
}
