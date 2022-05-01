package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class NIOFileAPITest1 {
    private static String home = System.getProperty("user.home");
    private static String playWithIO = "Temp Play Ground";

    @Test
    public void givenPathWhenCheckedThenConfirm() throws IOException {
        //check file exist
        Path homePath = Paths.get(home);
        Assertions.assertTrue(Files.exists(homePath));

        //deleting file and check file not exist
        Path playPath = Paths.get(home + playWithIO);
        if (Files.exists(playPath)) Files.delete(playPath);
        Assertions.assertTrue(Files.notExists(playPath));

        //create directory
        Files.createDirectory(playPath);
        Assertions.assertTrue(Files.exists(playPath));

        // create file
        IntStream.range(1, 10).forEach(cntr -> {
            Path tempFile = Paths.get(playPath + "/temp" + cntr);
            Assertions.assertTrue(Files.exists(tempFile));
            try {
                Files.createFile(tempFile);
            }
            catch (IOException e){
            }
            Assertions.assertTrue(Files.exists(tempFile));
        });
    }

}