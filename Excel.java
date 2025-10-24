/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitness2;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import org.apache.poi.util.IOUtils;
/**
 *
 * @author Luna
 */
public class Excel {
    
    private static final String NOMBRE_ARCHIVO = "entrenamientos.xlsx";

    public static void escribirDatos(String ejercicio, int pulsaciones, String fecha) {
        try {
            XSSFWorkbook workbook;
            XSSFSheet sheet;

            File archivo = new File(NOMBRE_ARCHIVO);
            if (archivo.exists()) {
                // Si ya existe, lo abrimos
                workbook = new XSSFWorkbook(new FileInputStream(archivo));
                sheet = workbook.getSheetAt(0);
            } else {
                workbook = new XSSFWorkbook();
                sheet = workbook.createSheet("Entrenamientos");

                // Cabeceras
                Row cabecera = sheet.createRow(0);
                cabecera.createCell(0).setCellValue("Ejercicio");
                cabecera.createCell(1).setCellValue("Pulsaciones");
                cabecera.createCell(2).setCellValue("Fecha");

                // Formato de columnas
                sheet.setColumnWidth(0, 5000);
                sheet.setColumnWidth(1, 4000);
                sheet.setColumnWidth(2, 5000);

            }

            // Crear nueva fila al final
            int filaNueva = sheet.getLastRowNum() + 1;
            Row fila = sheet.createRow(filaNueva);
            fila.createCell(0).setCellValue(ejercicio);
            fila.createCell(1).setCellValue(pulsaciones);
            fila.createCell(2).setCellValue(fecha);

            // Aplicar formato a las celdas
            CellStyle estilo = workbook.createCellStyle();
            estilo.setBorderBottom(BorderStyle.THIN);
            estilo.setBorderTop(BorderStyle.THIN);
            estilo.setBorderLeft(BorderStyle.THIN);
            estilo.setBorderRight(BorderStyle.THIN);
            estilo.setAlignment(HorizontalAlignment.CENTER);

            for (int i = 0; i < 3; i++) {
                fila.getCell(i).setCellStyle(estilo);
            }
            
            String imagePath = "fitness.png";
            byte[] bytes = null;

            try {
                InputStream inputStream = new FileInputStream(imagePath);
                bytes = IOUtils.toByteArray(inputStream);
            } catch (IOException e){
                e.printStackTrace();
            }
            
            int pictureIdx = workbook.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
            
            Drawing<?> drawing = sheet.createDrawingPatriarch();
            ClientAnchor anchor = workbook.getCreationHelper().createClientAnchor();
            
            anchor.setCol1(4);
            anchor.setRow1(4);
            anchor.setCol1(9);
            anchor.setRow1(6);
            
            Picture picture = drawing.createPicture(anchor, pictureIdx);
            
            // Guardar cambios
            FileOutputStream out = new FileOutputStream(NOMBRE_ARCHIVO);
            workbook.write(out);
            out.close();
            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Inserta una imagen en la hoja Excel (en la esquina superior derecha)
     */
   
}
