package lr54;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.regex.Pattern;

public class lr546 {
    public static void main(String[] args) throws IOException {
        File file_in = new File("C:\\Users\\kolag\\OneDrive\\Рабочий стол\\java_magister-main\\lr5\\src\\lr54\\lr546_in.fts");
        File file_out = new File("C:\\Users\\kolag\\OneDrive\\Рабочий стол\\java_magister-main\\lr5\\src\\lr54\\lr546_out.fts");
        file_out.delete();
        file_out.createNewFile();
        Path path = Path.of(file_out.getPath());
        Scanner in = new Scanner(file_in);
        String line;
        while(in.hasNextLine()) {
            line = in.nextLine();
            ArrayList<String> words = new ArrayList<>(List.of(line.split(" ")));
            int i = 0;
            int first = -1;
            while (i < words.size()){
                if (3 <= words.get(i).length() && words.get(i).length() <= 5){
                    if (first == -1){
                        first = i;
                        i++;
                    }
                    else{
                        words.remove(i);
                        words.remove(first);
                        i--;
                        first = -1;
                    }
                }else {
                    i++;
                }
            }
            String answer = "";
            for (int j = 0; j < words.size(); j++) {
                answer += words.get(j) + " ";
            }
            Files.write(path, Collections.singleton(answer), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        }
    }
}
