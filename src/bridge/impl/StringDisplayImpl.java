package bridge.impl;
/**
 * 진정한 구현의 단계
 * StringDisplayImpl 클래스는 문자열을 표시하는 클래스
 * DisplayImpl클래스의 하위클래스로서 rawOpen, rawPrint, rawClose 메소드를 사용해서 표시를 실행합니다. 
 * @author skplanet
 *
 */
public class StringDisplayImpl extends DisplayImpl {
	//표시해야할 문자열
	private String string;
	//바이트 단위로 계산할 문자열의 길이
	private int width;
	
	public StringDisplayImpl(String string) {
		//생성자에서 전달된 문자열 String을 필드에 기억
		this.string = string;
		//바이트단위의 길이도 필드에 기억 
		this.width = string.getBytes().length;
	} 
	
	@Override
	public void rawOpen() {
		// TODO Auto-generated method stub
		printLine();
	}

	@Override
	public void rawPrint() {
		// TODO Auto-generated method stub
		System.out.println("|"+string+"|");
	}

	@Override
	public void rawClose() {
		// TODO Auto-generated method stub
		printLine();
	}
	
	private void printLine() {
		//테두리의 모서리를 표현하는 + 마크를 표시
		System.out.print("+");
		//width만큼 "-"표시
		for (int i = 0; i<width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
