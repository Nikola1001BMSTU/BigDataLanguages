package lab_3.var_4.part_1;

import java.util.Date;

public class Library {
    Book[] books;
    Reader[] readers;
    Admin admin = new Admin();
    Library(int nBooks, int nReaders){
        books = new Book[nBooks];
        readers = new Reader[nReaders];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("title"+ i);
        }
        for (int i = 0; i < readers.length; i++) {
            readers[i] = new Reader("name"+ i);
        }
    }
    public Book[] getBooks(){
        return this.books;
    }
    public Reader[] getReaders() {
        return this.readers;
    }



}
