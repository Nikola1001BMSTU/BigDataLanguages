package lr62;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class lr626 {
    public static void main(String[] args) throws IOException {
        File file_in = new File("C:\\Users\\stale\\IdeaProjects\\java_magister\\lr6\\src\\lr62\\lr626_in.fts");
        Path path = Paths.get("C:\\Users\\stale\\IdeaProjects\\java_magister\\lr6\\src\\lr62\\lr626_out.fts");
        Scanner in = new Scanner(file_in);
        ArrayList<ArrayList<Integer>> dots = new ArrayList<>();
        HashMap<Float, HashMap<Float, Integer>> lines = new HashMap<>();
        boolean first = true;
        while (in.hasNext()){
            int x = in.nextInt();
            int y = in.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(x);
            temp.add(y);
            dots.add(temp);
        }
        for (int i = 0; i < dots.size(); i++) {
            Float x1 = Float.valueOf(dots.get(i).get(0));
            Float y1 = Float.valueOf(dots.get(i).get(1));
            for (int j = i + 1; j < dots.size(); j++) {
                Float x2 = Float.valueOf(dots.get(j).get(0));
                Float y2 = Float.valueOf(dots.get(j).get(1));
                Float k = (y2 - y1) / (x2 - x1);
                Float b = y1 - x1 * (y2 - y1) / (x2 - x1);
                if (lines.containsKey(k)){
                    lines.get(k).put(b, lines.get(k).get(b) + 1);
                }else {
                    HashMap<Float, Integer> temp = new HashMap<>();
                    temp.put(b, 2);
                    lines.put(k, temp);
                }
            }
        }
        for (Float i: lines.keySet()) {
            for (Float j: lines.get(i).keySet()){
                int ans = lines.get(i).get(j);
                if (ans > 2){
                    ans = (int) (1 + Math.sqrt(8 * ans - 7))/2;
                }
                String str = "Line " + i + "x + " + j + " contains " + ans + " dots on it";
                if (first) {
                    Files.write(path, Collections.singleton(str), StandardCharsets.UTF_8);
                    first = false;
                } else {
                    Files.write(path, Collections.singleton(str), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
                }
            }
        }
    }
}
