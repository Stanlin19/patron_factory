package org.factory.factory;

import org.factory.services.ExcelFile;
import org.factory.services.File;
import org.factory.services.PdfFile;

import java.util.HashMap;
import java.util.Map;

public class FileFactory {

    private final static Map<String, File> files = new HashMap<>(){{
        put("excel", new ExcelFile());
        put("pdf", new PdfFile());
    }};

    public File createFile(String tipo){
        return files.get(tipo);
    }
}
