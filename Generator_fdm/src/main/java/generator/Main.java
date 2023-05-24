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
		pag1.frame.setVisible(true);
		String s = "Interfata1";
		DateProfesor prof = new DateProfesor();
		Vector<DateProfesor> profi = new Vector<DateProfesor>();
		OperatiiNotepad txt = new OperatiiNotepad();
		Vector<String> nume_profesori = new Vector<String>();
		Vector<String> sali = new Vector<String>();
		while (true) {

			s = pag.setInterface(s, pag1, pag2);
			//System.out.println(s);
			if (s == "Interfata2") {
				String loc_prof = pag1.array[0];
				profi = txt.readLine(loc_prof);
				nume_profesori = prof.numeProfesori(profi);
				
				//sali=txt.readLine1(loc_sali);
			//	pag2 = new Interfata2(nume_profesori);
				pag2.setVisible(true);
				pag1.frame.setVisible(false);
				//System.out.println(s+"mainnn");
				System.out.println(pag1.array[4]+"pag1");
				System.out.println(pag2.array[0]);
				//pag2.array[0] = null;
				pag1.array[4] = null;
				System.out.println(pag1.array[4]+"pag1");
				s="stop";
				
				
			}
			
			
		}	


	}

}
