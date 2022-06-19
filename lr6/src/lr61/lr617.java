package lr61;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lr617 {
    public static void main(String[] args) throws FileNotFoundException {
        File file_in = new File("C:\\Users\\kolag\\OneDrive\\Рабочий стол\\java_magister-main\\lr6\\src\\lr61\\lr617_in.fts");
        Scanner in = new Scanner(file_in);
        ArrayList<String> my_list = new ArrayList<>();
        while (in.hasNextLine()){
            my_list.add(in.nextLine());
        }
        Collections.sort(my_list);
        System.out.println(my_list);
    }
}
