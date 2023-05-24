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
		String parametru_stop=null;
		String[] cuvinte_cheie= new String[8];
		
		String loc_document;
		String loc_profesori;
		String loc_sali;
		String loc_grupe;
		while (parametru_stop!="Finish") {

			s = pag.setInterface(s, pag1, pag2);
			if (s == "Interfata2") {
				 loc_document = pag1.array[0];
				 loc_profesori = pag1.array[1];
				 loc_sali=pag1.array[2];
				 loc_grupe=pag1.array[3];
				profesori = notePed.readLine(loc_profesori);
				nume_profesori=prof.numeProfesori(profesori);
				nume_profesori.add(0, null);
				nume_materii=prof.numeMateriiFunctie(profesori);
				nume_materii.add(0, null);
				nume_sali=notePed.readLine1(loc_sali);
				nume_sali.add(0, null);
				
				pag2 = new Interfata2(nume_profesori,nume_sali,nume_materii);

				pag1.array[4] = null;
 
				s = "stop";

			}
			parametru_stop=pag2.array[7];
			if(parametru_stop=="Finish")
			{
				pag2.setVisible(false);
				cuvinte_cheie[0]=pag2.array[1];
				
				
				
			}

		}
		for(int i=0; i<pag2.array.length;++i)
		{
			System.out.println(pag2.array[i]);
		}

	}

}
