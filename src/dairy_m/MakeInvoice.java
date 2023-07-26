package dairy_m;

import java.io.FileOutputStream;
import java.sql.*;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

class makeInvoice {
        void makeInvoice(int f_id, String name) {
                try {

                        Document document;
                        try {
                                String file = "Invoice.pdf";
                                document = new Document();

                                PdfWriter.getInstance(document, new FileOutputStream(file));
                                document.open();
                                float fntSize, lineSpacing;
                                fntSize = 24.7f;
                                lineSpacing = 30f;
                                String line = "                                             Singaji Milk Diary \n\n \n                                                                                                                  -----------------------------------";
                                Paragraph p = new Paragraph(new Phrase(20f, line,
                                                FontFactory.getFont(FontFactory.COURIER_BOLD, fntSize)));
                                p.setAlignment(5);

                                document.add(p);
                                String line2 = "BILL NO        " + "101";

                                Paragraph p1 = new Paragraph(new Phrase(30f, line2,
                                                FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                                p.setAlignment(5);

                                document.add(p1);

                                String line3 = "Farmer ID      " + f_id;
                                Paragraph p3 = new Paragraph(new Phrase(30f, line3,
                                                FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                                p.setAlignment(5);

                                document.add(p3);

                                String line4 = "Farmer Name    " + name;
                                Paragraph p4 = new Paragraph(new Phrase(30f, line4,
                                                FontFactory.getFont(FontFactory.COURIER_BOLD, 16.5f)));
                                p.setAlignment(5);

                                document.add(p4);
                                String line5 = "------------------------------------------                                                        ";
                                Paragraph p5 = new Paragraph(new Phrase(30f, line5,
                                                FontFactory.getFont(FontFactory.COURIER_BOLD, 20f)));
                                p.setAlignment(5);

                                document.add(p5);

                                PdfPTable pdft = new PdfPTable(4);

                                pdft.addCell("DATE");
                                pdft.addCell("FAT");
                                pdft.addCell("LITER");
                                pdft.addCell("RUPEES");
                                // document.add(pdft);

                                Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection con = DriverManager.getConnection(
                                                "jdbc:mysql://localhost:3306/Dairy_management_System", "root",
                                                "2412");
                                Statement pr = con.createStatement();
                                // String cust_id= "Where Farmer_name ="+Cust_id.getText();
                                String query = "Select DATEE ,FAT ,QUANTITY ,AMOUNT from milk WHERE FARMER_ID=" + f_id;
                                // String query2=" Where bill_id ="+Cust_id.getText();
                                ResultSet r = pr.executeQuery(query);
                                while (r.next()) {
                                        String bill_id = r.getString(1);
                                        String farmer_name = r.getString(2);
                                        String payment_date = r.getString(3);
                                        String payment_s = r.getString(4);
                                        pdft.addCell(bill_id);
                                        pdft.addCell(farmer_name);
                                        pdft.addCell(payment_date);
                                        pdft.addCell(payment_s);
                                        // document.add(pdft);

                                }
                                document.add(pdft);

                                String line7 = "                                                                                                                                                                               ------------------------------------------";
                                Paragraph p7 = new Paragraph(new Phrase(20f, line7,
                                                FontFactory.getFont(FontFactory.COURIER_BOLD, 20f)));
                                p.setAlignment(5);

                                document.add(p7);
                                ResultSet r1 = pr.executeQuery(
                                                "Select sum(quantity) AS TL,sum(Amount) as TA from milk WHERE farmer_ID="
                                                                + f_id);
                                String line8 = null;
                                while (r1.next()) {
                                        line8 = " TOTAL AMOUNT          " + r1.getString("TL") + "        "
                                                        + r1.getString("TA");
                                }
                                Paragraph p8 = new Paragraph(new Phrase(16f, line8,
                                                FontFactory.getFont(FontFactory.COURIER_BOLD, 20f)));
                                p.setAlignment(5);

                                document.add(p8);

                                String line9 = "------------------------------------------ ";
                                Paragraph p9 = new Paragraph(new Phrase(15f, line9,
                                                FontFactory.getFont(FontFactory.COURIER_BOLD, 20f)));
                                p.setAlignment(5);

                                document.add(p9);

                                // / / document.add(pg);

                                // Paragraph para=new Paragraph("");
                                // document.add(para);
                                document.close();

                                System.out.println("Finished");

                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

}