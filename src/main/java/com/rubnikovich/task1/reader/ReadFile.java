package com.rubnikovich.task1.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

    public List<String> readFile(String pathToFile) throws IOException {
        List<String> list = Files.readAllLines(Paths.get(pathToFile));
        return list;
    }

}
