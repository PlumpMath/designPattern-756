package template;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDisplay d1 = new CharDisplay('H');
		AbstractDisplay d2 = new StringDisplay("템플릿메소드"); 
		d1.display();
		d2.display();
	}

}
