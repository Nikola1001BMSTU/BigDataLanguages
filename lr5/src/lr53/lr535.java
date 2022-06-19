package lr53;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.Scanner;

public class lr535 {
    public static void main(String[] args) throws IOException {
        File file_in = new File("C:\\Users\\kolag\\OneDrive\\Рабочий стол\\java_magister-main\\lr5\\src\\lr53\\lr535_in.fts");
        Path path = Paths.get("C:\\Users\\kolag\\OneDrive\\Рабочий стол\\java_magister-main\\lr5\\src\\lr53\\lr535_out.fts");
        Scanner in = new Scanner(file_in);
        String line;
        boolean first = true;
        while(in.hasNextLine()) {
            line = in.nextLine();
            int max = 0;
            int curr = 0;
            for (int i = 0; i < line.length(); i++) {
                if ('0' <= line.charAt(i) && line.charAt(i) <= '9'){
                    curr++;
                    if (curr > max){
                        max = curr;
                    }
                } else {
                    curr = 0;
                }
            }
            if (first) {
                Files.write(path, Collections.singleton(String.valueOf(max)), StandardCharsets.UTF_8);
                first = false;
            } else {
                Files.write(path, Collections.singleton(String.valueOf(max)), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }
        }
    }
}
