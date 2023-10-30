package student;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;  




/**
 *
 * @author pchok
 */

public class TranscriptPDF {

    public static void main(String[] args) throws IOException {
        PDDocument document = new PDDocument();
//        PDFont font = PDFont.TIMES_ROMAN;
        PDPage page = new PDPage();
        document.addPage(page);
        PDPageContentStream contentStream = new PDPageContentStream(document, page);
//        contentStream.setFont(font,14);
         contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA), 14);

        // Table data
        String[] headers = {"Header 1", "Header 2", "Header 3"};
        String[][] data = {
            {"Row 1, Column 1", "Row 1, Column 2", "Row 1, Column 3"},
            {"Row 2, Column 1", "Row 2, Column 2", "Row 2, Column 3"},
            {"Row 3, Column 1", "Row 3, Column 2", "Row 3, Column 3"}
        };
        // Table parameters
        float margin = 50;
        float yStart = page.getMediaBox().getHeight() - margin;
        float tableWidth = page.getMediaBox().getWidth() - 2 * margin;
        float yPosition = yStart;
        int rows = data.length;
        int cols = headers.length;
        float rowHeight = 20f;
        float tableHeight = rowHeight * (float) rows;
        float tableWidthPercentage = 100f;
        // Draw table headers
        float tableWidthWithPercentage = tableWidth * tableWidthPercentage / 100f;
        float colWidth = tableWidthWithPercentage / (float) cols;
        float cellMargin = 5f;
         contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA), 14);
        float nextX = margin;
        float nextY = yStart;
        for (String header : headers) {
            float cellWidth = colWidth - 2 * cellMargin;
            contentStream.beginText();
            contentStream.newLineAtOffset(nextX + cellMargin, nextY - cellMargin);
            contentStream.showText(header);
            contentStream.endText();
            nextX += colWidth;
        }
        // Draw table content
        // Assuming you have already created the "contentStream" and set up the table data

// Define the line height
float lineHeight = 12; // Adjust this value as needed
for (String[] row : data) {
    nextY = yPosition;
    for (String cell : row) {
        // Split the cell content into lines based on the newline character '\n'
        String[] lines = cell.split("\n");
        
        // Set the font for the content stream
         contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA), 14);

        for (String line : lines) {
            // Begin text mode and set the text position
            contentStream.beginText();
            contentStream.newLineAtOffset(margin, nextY);
            contentStream.showText("\t"+line); // Show the line of text
            contentStream.endText();
            
            // Move the Y position to the next line
            nextY -= lineHeight;
        }
    }

    yPosition -= rowHeight;
}
contentStream.close();
// Specify the file path where you want to save the PDF
String filePath = "simple_table.pdf";
// Save the PDF to the specified file
document.save(filePath);
document.close();
System.out.println("PDF saved to: " + filePath);
    }
}
