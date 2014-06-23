package template;
/**
 * -하위 클래스에서 구체적으로 처리하기
 * 상위 클래스쪽에 템플릿에 해당하는 메소드가 정의되어 있고, 그 메소드의 정의 안에는 추상메소드가 사용되고 있음. 
 * 상위 클래스의 프로그램만 보면 추상 메소드를 어떻게 호출하고 있는지 알 수 있지만, 최종적으로 어떤 처리가 수행되는 지는 알 수 없음.
 * 추상 메소드를 실제로 구현하는 것은 하위 클래스. 서로 다른 하위 클래스가 서로 다른 구현을 실행하면 서로 다른 처리가 실행되지만, 
 * 큰 흐름은 상위 클래스에서 결정한대로 이루어진다. 
 * 이와같이 상위클래스에서 처리의 뼈대를 결정하고, 하위 클래스에서 그 구체적인 내용을 결정하는 패턴을 템플릿 메소드 패턴 이라 함.
 * @author skplanet
 *
 */
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("템플릿메소드"); 
		d1.display();
		d2.display();
	}

}
