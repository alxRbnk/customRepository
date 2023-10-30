package com.rubnikovich.task1.reader;

import com.rubnikovich.task1.exception.CustomException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadCustomFile {

    public List<String> readFile(String pathToFile) throws CustomException {
        List<String> list = null;
        try {
            list = Files.readAllLines(Paths.get(pathToFile));
        } catch (IOException e) {
            throw new CustomException("path to file is invalid");
        }
        return list;
    }

}
