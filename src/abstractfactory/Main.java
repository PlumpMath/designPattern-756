package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

/**
 * 구체적인 구현에는 주목하지 않고 API에 주목합니다. 그리고 API만을 사용해서 
 * 하위클래스 단계에서 구체적인 구현을 실행합니다. 
 */
public class Main {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage : java Main class.name.of.ConcreateFactory");
			System.out.println("EXAMPLE1 : java Main listfactory.ListFactory");
			System.out.println("EXAMPLE2 : java Main tablefactory.TableFactory");
			System.exit(0);
		}
		
		Factory factory = Factory.getFactory(args[0]);
		
		Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
		Link chosun = factory.createLink("조선일보", "http://www.chosun.com/");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
		Link kr_yahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.co.kr/");
		Link excite = factory.createLink("Excite", "http://www.excite.com/");
		Link google = factory.createLink("Google", "http://www.google.com/");
		
		Tray traynews = factory.createTray("신문");
		traynews.add(joins);
		traynews.add(chosun);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(kr_yahoo);
		
		Tray traysearch = factory.createTray("검색엔진");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "영진닷컴");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}
}
