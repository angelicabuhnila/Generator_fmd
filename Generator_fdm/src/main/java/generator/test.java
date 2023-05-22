package generator;

import java.util.Vector;

public class test {
	
	public static void main(String[] args) throws Exception {
		
		OperatiiNotped txt= new OperatiiNotped();
		String locatie="D:\\an3\\sem2\\pip_proiect\\Generator_fmd\\Generator_fmd\\Generator_fdm\\src\\main\\java\\generator\\Profesori";
		Vector<DateProfesor> profesori=new Vector<DateProfesor>();
				profesori=txt.readLine(locatie);
				System.out.println(profesori.size());
				DateProfesor date =new DateProfesor();
				date.afisare(profesori);
				//String p="Buhnila Angelica/Matematica/prof";
				//DateProfesor prof= new DateProfesor();
				//prof=txt.selectProf(p,23);
				//System.out.println("__"+prof.getNume()+prof.getFunctie()+ prof.getMaterie().elementAt(0));
	};

	

}
