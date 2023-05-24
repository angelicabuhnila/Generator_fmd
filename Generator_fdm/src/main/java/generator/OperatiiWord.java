package generator;

import com.spire.doc.*;
import com.spire.doc.documents.*;
import com.spire.doc.fields.TextRange;

import java.util.Vector;

public class OperatiiWord {

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
