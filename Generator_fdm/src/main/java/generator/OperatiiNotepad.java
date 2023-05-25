package generator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Vector;

public class OperatiiNotepad {
	/**
	 * 
	 * @param locatie - locatia fisierului cu grupe
	 * @param start   - de unde incepe citirea pentru inserarea in tabel
	 * @param stop    - unde se termina citirea pentru inserarea in tabel Group
	 *                selection function
	 */
	public Vector<String> selectare_studenti_grupa(String locatie, String start, String stop) {

		Vector<String> nume_grupe = new Vector<String>();

				try (BufferedReader reader = new BufferedReader(new FileReader(locatie))) {
			String line;
			boolean shouldRead = false; //

			while ((line = reader.readLine()) != null) {
				if (line.contains(start)) {
					shouldRead = true; //
				}

				if (shouldRead) {

					nume_grupe.add(line);
				}

				if (line.contains(stop)) {
					break; //
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		nume_grupe.remove(start);
		nume_grupe.remove(stop);
		nume_grupe.remove(null);

		return nume_grupe;

	}
	/**
	 * @param locatie - loagtia fisiserului cu grupe
	 * @param start - de unde incepe citirea pentru inserarea in tabel
	 * @param stop - unde se termina citirea pentru inserarea in tabel
	 * Group selection function
	 */
	public void selectare_grupe(String locatie,String start,String stop) {
          
	 Vector<String> nume_grupe = null;


		try (BufferedReader reader = new BufferedReader(new FileReader(locatie))) {
		    String line;
		    boolean shouldRead = false; //
		    
		    while ((line = reader.readLine()) != null) {
		        if (line.contains(start)) {
		            shouldRead = true; //
		        }
		        
		        if (shouldRead) {
		            System.out.println(line); //
		        }
		        
		        if (line.contains(stop)) {
		            break; // 
		        }
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
		}


	OperatiiNotepad() {
	};

	/**
	 * 
	 * @param locatie locatia fisierului txt
	 * @return toti profesori din txt
	 * @throws Exception daca locatia nu exista sau txt prezinta informatii
	 *                   incomplete
	 */

	public Vector<DateProfesor> readLine(String locatie) throws Exception {
		// citire date pe linie

		Vector<DateProfesor> rezerva = new Vector<DateProfesor>();
		int c;

		StringBuilder strb = new StringBuilder();
		try {
			InputStream in = new FileInputStream(locatie);
			while ((c = in.read()) != -1) {
				strb.append((char) c);
			}
			in.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bfr = new BufferedReader(new StringReader(strb.toString()));

		String s = bfr.readLine();
		int index = 1;
		while (s != null) {
			DateProfesor prof = new DateProfesor();
			prof = selectProf(s, index);
			rezerva.add(prof);
			s = bfr.readLine();
			++index;
		}

		return rezerva;
	}

	/**
	 * Selectare date si generare obiect de tip DateProfesor
	 * 
	 * @param s     datele de prelucrat
	 * @param index linia de unde s a fcaut citirea
	 * @return obiect de tip DateProfesor
	 * @throws Exception daca datele sunt incomplete pe o linie
	 */
	public DateProfesor selectProf(String s, int index) throws Exception {
		String[] array = s.split("/", 3); // delimitez datele pentru profesor

		try {
			if (array.length != 3)
				throw new Exception("Atentie, datele pentru linia " + index + " sunt incomplete. Verificati!");

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		String nume = array[0]; // nume Profesor
		String functie = array[2]; // functie Profesor
		String[] materie_rezerva = array[1].split(","); // delimitez materiile profesorului
		Vector<String> materie = new Vector<String>();
		for (int i = 0; i < materie_rezerva.length; ++i) {
			materie.add(materie_rezerva[i]);
		}
		DateProfesor prof = new DateProfesor(nume, materie, functie); // creez obiectul

		return prof;

	};

	/**
	 * citirea din fisier pe linie
	 * 
	 * @param locatie locatia fisierului
	 * @return fiecare linie din fisier este pusa intr un vector
	 * @throws Exception
	 */
	public Vector<String> readLine1(String locatie) throws Exception {
		// citire date pe linie

		Vector<String> rezerva = new Vector<String>();
		int c;

		StringBuilder strb = new StringBuilder();
		try {
			InputStream in = new FileInputStream(locatie);
			while ((c = in.read()) != -1) {
				strb.append((char) c);
			}
			in.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bfr = new BufferedReader(new StringReader(strb.toString()));

		String s = bfr.readLine();

		while (s != null) {

			rezerva.add(s);
			s = bfr.readLine();

		}

		return rezerva;
	}

};

