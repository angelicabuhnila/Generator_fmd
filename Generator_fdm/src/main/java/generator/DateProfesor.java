package generator;

import java.util.Vector;

/**
 * 
 * @author Angelica Clasa pentru stocarea datelor despre profesor
 *
 */
public class DateProfesor {
	/**
	 * Clasa contine numele profesorului, materiile si functia.
	 */
	private String nume;
	private Vector<String> materie;
	private String functie;

	/**
	 * Constructor fara argumente
	 */
	public DateProfesor() {
		this.setNume("");
		this.materie = null;
		this.setFunctie("");

	}

	/**
	 * Constructor cu argumente
	 * 
	 * @see void SetDateProfesor
	 */
	public DateProfesor(String nume, Vector<String> materie, String functie) throws Exception {

		try {
			if (nume == null || materie == null || functie == null) {
				throw new Exception("Date inexistente despre profesor!");
			}

			setDateProfesor(nume, materie, functie);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	/**
	 * Functie pentru setarea membrilor privati
	 * 
	 * @param nume
	 * @param materie
	 * @param functie
	 */
	public void setDateProfesor(String nume, Vector<String> materie, String functie) {
		this.setNume(nume);
		this.materie = materie;
		this.setFunctie(functie);

	}

	/**
	 * 
	 * @return nume profesor
	 */
	public String getNume() {
		return nume;
	}

	/**
	 * Set nume profesor
	 * 
	 * @param nume
	 */

	public void setNume(String nume) {
		this.nume = nume;
	}

	/**
	 * Materie profesor
	 * 
	 * @return
	 */

	public Vector<String> getMaterie() {
		return materie;
	}

	/**
	 * Set materie profesor
	 * 
	 * @param materie
	 */
	public void setMaterie(Vector<String> materie) {
		this.materie = new Vector<String>();
		this.materie = materie;
	}

	/**
	 * Functie profesor
	 * 
	 * @return
	 */

	public String getFunctie() {
		return functie;
	}

	/**
	 * Set functie profesor
	 * 
	 * @param functie
	 */
	public void setFunctie(String functie) {
		this.functie = functie;
	}

	/**
	 * Afisare profesori
	 * 
	 * @param profesori
	 */

	public void afisare(Vector<DateProfesor> profesori) {
		for (int i = 0; i < profesori.size(); ++i) {
			System.out.println("Nume: " + profesori.get(i).getNume());
			System.out.print("Materie:");
			for (int j = 0; j < profesori.get(i).materie.size(); ++j) {
				System.out.print(" " + profesori.get(i).materie.get(j));
			}
			System.out.println("\nFunctie: " + profesori.get(i).getFunctie());

		}
	}

	/**
	 * Selectez numele profesorilor pentru Interfata2
	 * 
	 * @param profesori
	 * @return
	 */
	public Vector<String> numeProfesori(Vector<DateProfesor> profesori) {
		Vector<String> numeProfesori = new Vector<String>();
		for (int i = 0; i < profesori.size(); ++i) {
			numeProfesori.add(profesori.get(i).getNume());
		}
		return numeProfesori;

	}

	/**
	 * Selectez materiile
	 * 
	 * @param profesori
	 * @return
	 */

	public Vector<String> numeMateriiFunctie(Vector<DateProfesor> profesori) {
		Vector<String> numeMaterii = new Vector<String>();
		for (int i = 0; i < profesori.size(); ++i) {
			numeMaterii.addAll(profesori.get(i).getMaterie());

		}
		return numeMaterii;

	}
	
	/**
	 * 
	 * @param profesori
	 * @param profesor
	 * @return functia profesorului
	 */
	public String functieProfesor(Vector<DateProfesor> profesori,String profesor) {
		 
		for (int i = 0; i < profesori.size(); ++i) {
			if(profesori.get(i).getNume()==profesor)
			{
				return profesori.get(i).getFunctie();
			}

		}
		return null;

	}


}
