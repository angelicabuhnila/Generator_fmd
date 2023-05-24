package generator;

import java.util.Vector;

import com.spire.doc.Document;
/**
 * 
 * @author Denisa
 *
 */
import com.spire.doc.*;
import com.spire.doc.documents.*;
import com.spire.doc.fields.TextRange;

import java.util.Vector;


import com.spire.doc.*;
import com.spire.doc.documents.*;
import com.spire.doc.fields.TextRange;

import java.util.Vector;

import com.spire.doc.*;
import com.spire.doc.documents.*;
import com.spire.doc.fields.TextRange;

import java.util.Vector;

import com.spire.doc.*;
import com.spire.doc.documents.*;
import com.spire.doc.fields.TextRange;

import java.util.Vector;

import com.spire.doc.*;
import com.spire.doc.documents.*;
import com.spire.doc.fields.TextRange;

import java.util.Vector;

import com.spire.doc.*;
import com.spire.doc.documents.*;
import com.spire.doc.fields.TextRange;

import java.util.Vector;

import com.spire.doc.*;
import com.spire.doc.documents.*;
import com.spire.doc.fields.TextRange;

import java.util.Vector;

import com.spire.doc.*;
import com.spire.doc.documents.*;
import com.spire.doc.fields.TextRange;

import java.util.Vector;

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
	
	
	
	public OperatiiWord() {
	};

	public void insertTabel(Document document, Vector<String> numeStudenti) {

		Section section = document.addSection();

		// Define the data for table
		String[] header = { "Nr.", "Nume", "Semnatura" };

		String[][] data = new String[numeStudenti.size()][];
		for (int i = 0; i < data.length; ++i) {
			data[i] = new String[] { "" + ++i, numeStudenti.get(i), " " };
		}

		// Add a table
		Table table = section.addTable(true);
		table.resetCells(data.length + 1, header.length);

		// Set the first row as table header
		TableRow row = table.getRows().get(0);
		row.isHeader(true);
		row.setHeight(20);
		row.setHeightType(TableRowHeightType.Exactly);
		for (int i = 0; i < header.length; i++) {
			row.getCells().get(i).getCellFormat().setVerticalAlignment(VerticalAlignment.Middle);
			Paragraph p = row.getCells().get(i).addParagraph();
			p.getFormat().setHorizontalAlignment(HorizontalAlignment.Center);
			TextRange txtRange = p.appendText(header[i]);
			txtRange.getCharacterFormat().setBold(true);
		}

		// Add data to the rest of rows
		for (int r = 0; r < data.length; r++) {
			TableRow dataRow = table.getRows().get(r + 1);
			dataRow.setHeight(25);
			dataRow.setHeightType(TableRowHeightType.Exactly);
			for (int c = 0; c < data[r].length; c++) {
				dataRow.getCells().get(c).getCellFormat().setVerticalAlignment(VerticalAlignment.Middle);
				dataRow.getCells().get(c).addParagraph().appendText(data[r][c]);
			}

		}
	}
}
