package generator;

import java.util.Vector;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ActiuneButoane pag = new ActiuneButoane();
		Interfata1 pag1 = new Interfata1();
		Interfata2 pag2 = new Interfata2();
		String s = "Interfata1";
		DateProfesor prof = new DateProfesor();
		Vector<DateProfesor> profesori = new Vector<DateProfesor>();
		OperatiiNotepad notePed = new OperatiiNotepad();
		Vector<String> nume_profesori = new Vector<String>();
		Vector<String> nume_materii = new Vector<String>();
		Vector<String> nume_sali = new Vector<String>();
		

		while (true) {

			s = pag.setInterface(s, pag1, pag2);
			if (s == "Interfata2") {
				String loc_document = pag1.array[0];
				String loc_profesori = pag1.array[1];
				String loc_sali=pag1.array[2];
				String loc_grupe=pag1.array[3];
				profesori = notePed.readLine(loc_profesori);
				nume_profesori=prof.numeProfesori(profesori);
				nume_materii=prof.numeMateriiFunctie(profesori, "Carlos");
				nume_sali=notePed.readLine1(loc_sali);
				
				pag2 = new Interfata2(nume_profesori,nume_sali,nume_materii);

				pag1.array[4] = null;

				s = "stop";

			}

		}

	}

}
