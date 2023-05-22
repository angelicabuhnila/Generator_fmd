package generator;

import java.util.Vector;

/**
 * 
 * @author Angelica Creeare clasa pentru stocarea datelor despre profesor
 *
 */
public class DateProfesor {

	private String nume;
	private Vector<String> materie;
	private String functie;

	/**
	 * Constructor fara argumente
	 */
	public DateProfesor() {
		this.nume = "";
		this.materie = null;
		this.functie = "";

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
		this.nume = nume;
		this.materie = materie;
		this.functie = functie;

	}

	/**
	 * Functie pentru returnare date profesor
	 * 
	 * @return
	 */
	public DateProfesor getDateProfesor() {
		DateProfesor p = new DateProfesor();
		p.nume = this.nume;
		p.materie = this.materie;
		p.functie = this.functie;
		return p;
	}

}
