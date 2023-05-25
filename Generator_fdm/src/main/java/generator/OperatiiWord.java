package generator;

import java.util.Vector;

/**
 * 
 * @author Denisa
 *
 */
import com.spire.doc.Document;
import com.spire.doc.Section;
import com.spire.doc.Table;
import com.spire.doc.TableRow;
import com.spire.doc.documents.HorizontalAlignment;
import com.spire.doc.documents.Paragraph;
import com.spire.doc.documents.TableRowHeightType;
import com.spire.doc.documents.VerticalAlignment;
import com.spire.doc.fields.TextRange;


public class OperatiiWord {

	/**
	 * Generarea fisei
	 * @param locatie_document
	 * @param locatie_grupe
	 * @param cuvinte_cheie
	 * @param grupe_selectate
	 * @throws Exception eroare citire sau scriere in document
	 */
	void generareDocument(String locatie_document, String locatie_grupe, String[] cuvinte_cheie,
			Vector<String> grupe_selectate) throws Exception {
		OperatiiNotepad objNtp = new OperatiiNotepad();
		Vector<String> selectNumeGrupe = objNtp.selectNumeGrupe(locatie_grupe, "13");
		for (int i = 0; i < grupe_selectate.size(); ++i) {
			Document document = new Document();
			document.loadFromFile(locatie_document);
			
			String start = grupe_selectate.get(i);
			int index = selectNumeGrupe.indexOf(start);
			String stop = selectNumeGrupe.get(index + 1);

			Vector<String> selectare_studenti_grupa = objNtp.selectare_studenti_grupa(locatie_grupe, start, stop);
			cuvinte_cheie[4] = "" + selectare_studenti_grupa.size();
			cuvinte_cheie[7]=start;
			creeareDocument(document, cuvinte_cheie);

			insertTabel(document, selectare_studenti_grupa);
			/**
			 * Salvare document
			 */

			document.saveToFile("FisaGenerata" + cuvinte_cheie[7] + "_" + cuvinte_cheie[5] + ".docx");

		}

	}

	{

	}

	void creeareDocument(Document document, String[] cuvinte_cheie) {
		
		/**
		 * Inlocuire cuvinte gasite pe text cu datele din interfata
		 */

		document.replace("#nume", cuvinte_cheie[0], false, true);
		document.replace("#functia", cuvinte_cheie[1], false, true);
		document.replace("#asistat", cuvinte_cheie[2], false, true);
		document.replace("#data", cuvinte_cheie[3], false, true);
		document.replace("#nr", cuvinte_cheie[4], false, true);
		document.replace("#materie", cuvinte_cheie[5], false, true);
		document.replace("#sala", cuvinte_cheie[6], false, true);
		document.replace("#grupa", cuvinte_cheie[7], false, true);
		

	};

	public OperatiiWord() {
	};
/**
 * Inserare tabel
 * @param document documentul in care inserez
 * @param numeStudenti  numele studentilor pe care ii inserezi
 */
	public void insertTabel(Document document, Vector<String> numeStudenti) {

		Section section = document.addSection();

		// Define the data for table
		String[] header = { "Nr.", "Nume", "Semnatura" };

		String[][] data = new String[numeStudenti.size()][3];
		for (int i = 0; i < data.length; ++i) {
			int index=1+i;
			String index1=" "+index;
			data[i] = new String[] {index1,numeStudenti.get(i), "\n" };
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
