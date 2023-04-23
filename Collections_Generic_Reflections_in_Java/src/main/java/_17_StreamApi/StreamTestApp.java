package _17_StreamApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTestApp {

    public static void main(String[] args) throws IOException {

        String path = "D:\\UDEMY_COURSES\\Generic\\Collections_Generic_Reflections_in_Java\\src\\main\\java\\_17_StreamApi\\names";

        Files.lines(Paths.get(path))
                .forEach(System.out::println);

        System.out.println("====================");

        List<String> names = Files.lines(Paths.get(path)).filter(x -> x.endsWith("a")).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
