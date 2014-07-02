package abstractfactory.listfactory;

import abstractfactory.factory.Tray;

public class ListTray extends Tray {
	public ListTray(String caption) {
		super(caption);
	}
	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n");
		buffer.append(caption + "\n");
		return null;
	}

}
