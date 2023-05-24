package generator;

import java.util.Vector;

public class test {
	
	public static void main(String[] args) throws Exception {
		
		OperatiiNotepad txt= new OperatiiNotepad();
		String locatie="D:\\an3\\Proiect\\Generator_fmd\\Generator_fdm\\src\\main\\java\\generator\\sali.txt";
		
		Vector<String> profesori=new Vector<String>();
				profesori=txt.readLine1(locatie);
				System.out.println(profesori.size());
				DateProfesor date =new DateProfesor();
				//date.afisare(profesori);
				//String p="Buhnila Angelica/Matematica/prof";
				//DateProfesor prof= new DateProfesor();
				//prof=txt.selectProf(p,23);
				//System.out.println("__"+prof.getNume()+prof.getFunctie()+ prof.getMaterie().elementAt(0));
	};

	

}
