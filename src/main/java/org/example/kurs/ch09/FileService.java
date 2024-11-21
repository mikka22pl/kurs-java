package org.example.kurs.ch09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

class FileService {

    void readSmallFile() {
        Path path = Paths.get("small_file.txt");

        try {
            List<String> lines = Files.readAllLines(path);

            lines.forEach(line -> {
                System.out.println("line: " + line);
            });
        } catch (IOException e) {
//            System.out.println("Wystąpił błąd: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void writeSmallFile(String toSave) {
        Path path = Paths.get("small_file.txt");

        try {
            Files.writeString(path, toSave + System.lineSeparator(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void readBigFile() {
        Path path = Paths.get("big_file.txt");

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("buff line: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void writeBigFile(String toSave) {
        Path path = Paths.get("big_file.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            writer.write(toSave + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
