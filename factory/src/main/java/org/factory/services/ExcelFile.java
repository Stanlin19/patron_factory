package org.factory.services;

public class ExcelFile implements File{
    @Override
    public void create() {
        System.out.println("Se crea archivo de excel");
    }
}
