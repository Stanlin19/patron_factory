package org.factory.services;

public class PdfFile implements File{


    @Override
    public void create() {
        System.out.println("Se crea un archivo pdf");
    }
}
