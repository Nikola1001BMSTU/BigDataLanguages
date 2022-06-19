package lr54;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class lr545 {
    public static void main(String[] args) throws IOException {
        File file_in = new File("C:\\Users\\stale\\IdeaProjects\\java_magister\\lr5\\src\\lr54\\lr545_in.fts");
        File file_out = new File("C:\\Users\\stale\\IdeaProjects\\java_magister\\lr5\\src\\lr54\\lr545_out.fts");
        file_out.delete();
        file_out.createNewFile();
        Path path = Path.of(file_out.getPath());
        Scanner in = new Scanner(file_in);
        String line;
        Scanner in_cmd = new Scanner(System.in);
        int choose = in_cmd.nextInt();
        while(in.hasNextLine()) {
            line = in.next();
            if (choose == 1 && Pattern.matches("[0-9]+", line)) { //Число
                Files.write(path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }
            if (choose == 2 && Pattern.matches("([+-]?(?=\\.\\d|\\d)(?:\\d+)?(?:\\.?\\d*))(?:[eE]([+-]?\\d+))?", line)) { //float
                Files.write(path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }
            if (choose == 3 && Pattern.matches("[a-zA-Z]", line)) { //char
                Files.write(path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }
            if (choose == 4 && Pattern.matches("[a-zA-Z]+", line)) { //string
                Files.write(path, Collections.singleton(line), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }
        }
    }
}
