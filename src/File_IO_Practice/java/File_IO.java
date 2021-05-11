package File_IO_Practice.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class File_IO {
    public static void printRecipe(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContent = Files.readAllLines((filePath));
        for (int i = 0; i < fileContent.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContent.get(i));
        }
    }

    public static void main(String[] args) throws IOException {
        Path filePathtoRecipe = Paths.get("./src/fileIO/wcw.txt");
        Path sameDirectoryPath = Paths.get("../wcw.txt");

        System.out.println("filePathtoRecipe = " + filePathtoRecipe);

        System.out.println("Files.exists(filePathtoRecipe) = " + Files.exists(filePathtoRecipe));

    }
}
