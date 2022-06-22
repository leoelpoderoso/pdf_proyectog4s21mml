/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf_proyectog4s21mml;


import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Pdf_proyectoG4s21MML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PdfWriter pdfwriter = null;
      try {
          String nombrearch = "archivopdf.pdf";
          File file = new File (nombrearch);
          pdfwriter = new PdfWriter(file);
          String cadena = "datos dentro del archivo";
          PdfDocument pdfDocument = new PdfDocument(pdfwriter);
          Document document = new Document(pdfDocument);
          Paragraph paragraph = new Paragraph("Hola ");
          document.add(paragraph);
          PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
          
          cadena = "Soy un Dios";
          paragraph = new Paragraph(cadena);
          paragraph.setFont(font);
          Color myColor = new DeviceRgb(255, 100, 20);
          paragraph.setFontColor(myColor);
           paragraph.setFirstLineIndent(100);
            paragraph.setTextAlignment(TextAlignment.JUSTIFIED_ALL);
            document.add(paragraph);
            pdfDocument.close();
            pdfwriter.close();
            
          
          
      }catch (IOException ex) {
          ex.printStackTrace();
      }
        
    }
    
}
