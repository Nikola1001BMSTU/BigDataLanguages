package lr62;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class lr625 {
    public static void main(String[] args) throws FileNotFoundException {
        File file_in = new File("C:\\Users\\stale\\IdeaProjects\\java_magister\\lr6\\src\\lr62\\lr625_in.fts");
        Scanner in = new Scanner(file_in);
        LinkedList<Integer> C1 = new LinkedList<>();
        LinkedList<Integer> C2 = new LinkedList<>();
        int i = in.nextInt();
        while (i > 0){
            C1.add(i);
            i = in.nextInt();
        }
        i = in.nextInt();
        while (in.hasNext()){
            C2.add(i);
            i = in.nextInt();
        }
        C2.add(i);
        Collections.sort(C1);
        Collections.sort(C2);
        LinkedList<Integer> C = new LinkedList<>();
        while (C1.size() != 0 || C2.size() != 0){
            if (C1.size() > 0 && C2.size() > 0){
                if (C1.peekFirst() <= C2.peekFirst()){
                    C.add(C1.pollFirst());
                }else{
                    C.add(C2.pollFirst());
                }
            }else if (C1.size() == 0){
                C.add(C2.pollFirst());
            }else{
                C.add(C1.pollFirst());
            }
        }
        System.out.println(C);
    }
}
