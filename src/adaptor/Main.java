package adaptor;
/**
 * Adapter패턴은 wrapper패턴으로 불리기도 합니다. wrapper는 '감싸는 것'이라는 의미.
 * 일반 상품을 포장지로 싸서 선물용 상품으로 만드는 것처럼, 무엇인가를 한번 포장해서 다른 용도로 사용할 수 있게 교환해 주는 
 * 것이 Adpater의 역할
 * @author skplanet
 *
 */
public class Main {
	public static void main(String[] str) {
		Print p = new PrintBanner("Hello Bumziki");
		p.printWeak();
		p.printStrong();
	}
}
