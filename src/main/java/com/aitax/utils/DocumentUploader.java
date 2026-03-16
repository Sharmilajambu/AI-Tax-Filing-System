package com.aitax.utils;

import java.io.File;

public class DocumentUploader {

    public void uploadDocument(String path) {

        if (path == null || path.trim().isEmpty()) {
            System.out.println("Error: File path cannot be empty.");
            return;
        }

        File file = new File(path);

        if (file.exists() && file.isFile()) {
            System.out.println("Document uploaded successfully: " + file.getName());
            System.out.println("Size: " + file.length() + " bytes");
        } else if (file.exists() && file.isDirectory()) {
            System.out.println("Error: Path points to a directory, not a file.");
        } else {
            System.out.println("Error: File not found at path — " + path);
        }

    }

}
