package generator;

import java.util.Vector;
/**
 * 
 * @author Angelica
 *
 *Unirea claselor pentru generarea produsului final
 */
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
		
		String loc_document="D:\\proiect\\Generator_fmd\\Generator_fdm\\fisa.docx";
		String loc_profesori="D:\\proiect\\Generator_fmd\\Generator_fdm\\src\\main\\java\\generator\\Profesori";
		String loc_sali="D:\\proiect\\Generator_fmd\\Generator_fdm\\src\\main\\java\\generator\\sali.txt";
		String loc_grupe="D:\\proiect\\Generator_fmd\\Generator_fdm\\src\\main\\java\\generator\\Grupe";
		while (parametru_stop!="Finish") {

			s = pag.setInterface(s, pag1, pag2);
			if (s == "Interfata2") {
				// loc_document = pag1.array[0];
				// loc_profesori = pag1.array[1];
				// loc_sali=pag1.array[2];
				 //loc_grupe=pag1.array[3];
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
				cuvinte_cheie[1]="functia_curs_realizare";
				//get functie dupa nume profesor 
				cuvinte_cheie[2]=pag2.array[2];
				cuvinte_cheie[3]="dataa";
				//cuvinte_cheie[4]=array[] 
					//dimensiunea vectorului de studenti
				cuvinte_cheie[5]=pag2.array[3];
				cuvinte_cheie[6]=pag2.array[4];
				
			}

		}
		
		//System.out.println(pag2.grupe_selectate.size());
		OperatiiWord word= new OperatiiWord();
		word.generareDocument(loc_document, loc_grupe, cuvinte_cheie, pag2.grupe_selectate);
		System.out.println("Finalizare!");
		
		

	}

}
