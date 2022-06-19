/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21juanpdf;

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
 * @author user
 */
public class G4s21JuanPDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PdfWriter pdfwriter = null;
        try {
            // TODO code application logic here
            String nombrearch = "Juan Manuel.pdf";
            File file = new File(nombrearch);
            pdfwriter = new PdfWriter(file);
            
            String cadena = "Mi primer pdf esta bien bonito jajajaja ";
            
            PdfDocument pdfDocument = new PdfDocument(pdfwriter);
            Document document = new Document(pdfDocument);
            Paragraph paragraph = new Paragraph("holaaaaaaaaaaaaaaaaaaaaaaaa");
            document.add(paragraph);
            paragraph = new Paragraph(cadena);
            document.add(paragraph);
            PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
            
            cadena = "Nuestra gran experiencia y nuestros \n" +
                      "precios accesibles nos han permitido posicionarnos \n" +
                      "dentro de los mejores en el ramo, satisfaciendo \n" +
                      "así, a todos nuestros clientes, logrando que en sus \n" +
                      "fiestas o reuniones el espacio este lleno de \n" +
                      "comodidad y momentos inolvidables";
            paragraph = new Paragraph(cadena);
            paragraph.setFont(font);
            Color myColor = new DeviceRgb (200, 100, 10);
            paragraph.setFontColor(myColor);
            paragraph.setFirstLineIndent(100);
            paragraph.setTextAlignment(TextAlignment.JUSTIFIED_ALL);
            document.add(paragraph);
            pdfDocument.close();
            pdfwriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        
    
    }
    
}
