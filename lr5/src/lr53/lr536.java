package lr53;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class lr536 {
    public static void main(String[] args) throws IOException {
        File file_in = new File("C:\\Users\\kolag\\OneDrive\\Рабочий стол\\java_magister-main\\lr5\\src\\lr53\\lr536_in.fts");
        Path path = Paths.get("C:\\Users\\kolag\\OneDrive\\Рабочий стол\\java_magister-main\\lr5\\src\\lr53\\lr536_out.fts");
        Scanner in = new Scanner(file_in);
        String line;
        HashMap<String, Integer> key_words = filling();
        int k = 1;
        while(in.hasNextLine()) {
            line = in.nextLine();
            String[] words = line.split(" ");
            for (String i : words) {
                if (key_words.containsKey(i.toLowerCase(Locale.ROOT))){
                    key_words.put(i.toLowerCase(Locale.ROOT), key_words.get(i.toLowerCase(Locale.ROOT)) + 1);
                }
            }
            String answer = new String();
            answer += ("line " + k + ": ");
            for (String i: key_words.keySet()) {
                int max = 0;
                String max2 = null;
                for (String j: key_words.keySet()) {
                    if (key_words.get(j) > max){
                        max2 = j;
                        max = key_words.get(j);
                    }
                }
                try {
                    if (key_words.get(max2) != 0) {
                        answer += max2 + ", ";
                    }
                    key_words.put(max2, 0);
                }catch (Exception ignored){}
            }
            if (k == 1) {
                Files.write(path, Collections.singleton(answer), StandardCharsets.UTF_8);
            }else {
                Files.write(path, Collections.singleton(answer), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            }
            key_words = filling();
            k++;
        }
    }

    public static HashMap filling(){
        HashMap<String, Integer> a = new HashMap<>();
        a.put("не", 0);
        a.put("и", 0);
        a.put("как", 0);
        return a;
    }
}
