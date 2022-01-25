package day8.StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P1SumLines {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Pepi\\Programirane\\Java\\SoftUni" +
                "\\JavaAdvancedSept2021\\Documents" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        Files.readAllLines(Path.of(path)).stream().map(String::toCharArray)
                .forEach(charArray -> {
                    int sum = 0;
                    for (char symbol : charArray) {
                        sum += symbol;
                    }
                    System.out.println(sum);
                });
    }
}
