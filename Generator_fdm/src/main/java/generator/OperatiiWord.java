package generator;

import java.util.Vector;

import com.spire.doc.Document;
/**
 * 
 * @author Denisa
 *
 */
public class OperatiiWord {

	
			  
 void operatii(String locatie_doc,String[] cuvinte_cheie ) {
		/**
		 * Creare Document
		 */
		Document document = new Document();
       
		 /**
		  * Load a Word document
		  */
		 
		 document.loadFromFile(locatie_doc);
		 cuvinte_cheie = new String[10];
		
 /**
  * Inlocuire cuvinte gasite pe text cu datele din interfata
  */
		
		 document.replace("#nume",cuvinte_cheie[0], false, true);
		 document.replace("#functia",cuvinte_cheie[1], false, true);
		 document.replace("#asistat",cuvinte_cheie[2], false, true);
		 document.replace("#data",cuvinte_cheie[3], false, true);
		 document.replace("#nr",cuvinte_cheie[4], false, true);
		 document.replace("#materie",cuvinte_cheie[5], false, true);
		 document.replace("#sala",cuvinte_cheie[6], false, true);
		 document.replace("#grupa",cuvinte_cheie[7], false, true);
		  //Save the result document
	/**
	 * Salvare document	 
	 */
	 document.saveToFile("FisaGenerata" +cuvinte_cheie[7]+"_"+cuvinte_cheie[5]+".docx");
	};
	
	
	


}
