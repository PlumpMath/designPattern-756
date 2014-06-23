package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCardFactory;
/**
 * 템플릿 메소드 패턴 상위 클래스에 처리 골격을 만들고, 하위 클래스에서 구체적인 처리의 내용을 만든다.
 * 이 패턴을 인스턴스 생성의 장면에 적용한 것이 팩토리 메소드 패턴 
 * @author skplanet
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("권범직");
		Product card2 = factory.create("안우진");
		Product card3 = factory.create("박원호");
		card1.use();
		card2.use();
		card3.use();
	}

}
