package generator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActiuneButoane implements ActionListener {

	public ActiuneButoane() {
		// TODO Auto-generated constructor stub
	}

	public String setInterface(String s, Interfata1 pag1, Interfata2 pag2) {
		if (s == "Interfata1") {

			pag1.frame.setVisible(true);
			pag2.setVisible(false);
			if (pag1.array[4] != null) {

				pag2.array[0] = null;
				s = pag1.array[4];
			}
			System.out.println("cevaa");

		} else if (s == "Interfata2") {
			pag2.setVisible(true);
			pag1.frame.setVisible(false);
			if (pag2.array[0] != null) {
				pag1.array[4] = null;
				s = pag2.array[0];
			}
		}
		return s;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comanda = e.getActionCommand();
		switch (comanda) {
		case "Start":
			// butonStart(comanda,e);
			break;
		}

	}

	// classa pt ascultaor + functii
}
