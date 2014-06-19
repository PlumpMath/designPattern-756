package proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p = new PrinterProxy("Bumziki");
		System.out.println("이름은 현재 "+p.getPrinterName() + " 입니다.");
		p.setPrinterName("Jomi");
		System.out.println("이름은 현재 "+p.getPrinterName() + " 입니다.");
		p.print("Hello, world.");
	}

}
