package org.factory;

import org.factory.factory.FileFactory;
import org.factory.services.File;

public class Main {
    public static void main(String[] args) {
        String tipo = "excel";
        FileFactory factory = new FileFactory();
        File file = factory.createFile(tipo);
        file.create();
    }
}