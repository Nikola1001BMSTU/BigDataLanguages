package lab_3.var_4.part_1;

import java.util.Date;

public class Admin {
    public void addBlacklist(Reader reader) {
        reader.blackList = true;
    }
    public void checkReaders(Reader reader) {
        Date date = new Date();
        for (int i = 0; i < reader.book.length; i++) {
            if (reader.book[i] != null) {
                if (reader.book[i].date != 0) {
                    long t = date.getTime() - reader.book[i].date;
                    System.out.println(t);
                    System.out.println(reader.book[i].date);
                    System.out.println(date.getTime());
                    if (date.getTime() - reader.book[i].date > 1L) {
                        addBlacklist(reader);
                    }
                }
            }
        }
    }
}
