package factory;

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCardFactory;

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
