package memoryLeak;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MemoryLeakRunner {

    public static void main(String[] args) {
        List<List<String>> devilList = new ArrayList<>();
        List<String> words = new ArrayList<>();
        try (Stream<String> stream = Files.lines(getPathToData("Data.txt"))) {

            words = stream.map(str -> str.split(" ")).flatMap(Arrays::stream)
                    .collect(Collectors.toList());

            int size = words.size();
            devilList.add(words.subList(size-3, size));
            System.out.println("gfhjfghjfgj");
        } catch (IOException e) {
            e.printStackTrace();
        }
        devilList.size();
    }

    private static Path getPathToData(String fileName) {
        try {
            return Paths.get(ClassLoader.getSystemResource(fileName).toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }
}
