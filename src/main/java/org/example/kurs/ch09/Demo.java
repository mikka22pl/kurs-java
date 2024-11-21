package org.example.kurs.ch09;

public class Demo {

    public static void main(String[] args) {

        FileService fileService = new FileService();

        fileService.writeSmallFile("Hello, save me!");

        fileService.readSmallFile();

        fileService.writeBigFile("Cras vitae varius augue. Duis elementum dictum tempor.");

        fileService.readBigFile();
    }
}
