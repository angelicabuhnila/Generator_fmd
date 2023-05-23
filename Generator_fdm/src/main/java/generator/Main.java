package generator;

import java.awt.event.ComponentListener;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ActiuneButoane pag = new ActiuneButoane();
		Interfata1 pag1 = new Interfata1();
		Interfata2 pag2 = new Interfata2();
		pag1.frame.setVisible(true);
		String s = "Interfata1";

		while (true) {

			s = pag.setInterface(s, pag1, pag2);
		}

	}

}
