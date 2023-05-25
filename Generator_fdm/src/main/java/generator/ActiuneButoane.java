package generator;

/**
 * 
 * @author Angelica clasa pentru comutarea interfetelor
 */
public class ActiuneButoane {

	public ActiuneButoane() {
		

	}

	/**
	 * 
	 * @param s    parametru control interfete
	 * @param pag1 Interfata1
	 * @param pag2 Interfata2
	 * @return numele interfetei actuale
	 */

	public String setInterface1(String s, Interfata1 pag1, Interfata2 pag2) {
		pag1.frame.setVisible(true); // afisare pag1
		pag2.setVisible(false);

		if (pag1.array[4] != null) { // daca butonul start este apasat schimb interfata

			pag2.array[0] = null; // ascund interfata2
			s = pag1.array[4]; // actualizez parametrul de control

		}
		return s;
	}

	/**
	 * 
	 * @param s    parametru control interfete
	 * @param pag1 Interfata1
	 * @param pag2 Interfata2
	 * @return numele interfetei actuale
	 */

	public String setInterface2(String s, Interfata1 pag1, Interfata2 pag2) {
		pag2.setVisible(true); // afisare pag2
		pag1.frame.setVisible(false);

		if (pag2.array[0] != null) { // daca butonul back este apasat schimb interfata
			pag1.array[4] = null; // ascund interfata1
			s = pag2.array[0]; // actualizez parametrul de control

		}
		return s;
	}

	/**
	 * 
	 * @param s    parametru control interfete
	 * @param pag1 Interfata1
	 * @param pag2 Interfata2
	 * @return numele interfetei actuale
	 */

	public String setInterface(String s, Interfata1 pag1, Interfata2 pag2) {

		// folosesc un switch pentru aspectul codului
		switch (s) {
		case "Interfata1":
			s = setInterface1(s, pag1, pag2);
			break;

		case "Interfata2":
			s = setInterface2(s, pag1, pag2);
			break;

		case "stop":
			s = setInterface2(s, pag1, pag2);
			break;
		}

		return s;

	}

}
