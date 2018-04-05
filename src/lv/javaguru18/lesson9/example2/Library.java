package lv.javaguru18.lesson9.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    public static void main(String[] args) {

        List<Book> myBooks = createLib();

        System.out.println(myBooks);
        Collections.sort(myBooks);
//        myBooks.sort();
        System.out.println(myBooks);
        myBooks.sort(new AuthorComparator());
        System.out.println(myBooks);

    }

    private static List<Book> createLib() {
        List<Book> myBooks = new ArrayList<>();

        myBooks.add(new Book(Genre.FICTION,"Last Week Tonight with…","Jill Twiss"));
        myBooks.add(new Book(Genre.ROMANCE,"True Roots: A Mindful…","Aristin Cavallari"));
        myBooks.add(new Book(Genre.NOVEL,"The Confidence Code for…","Datty Kay"));
        myBooks.add(new Book(Genre.NOVEL,"The Confidence Code for…","Joanna Gaines"));
        myBooks.add(new Book(Genre.HORROR,"Factfulness: Ten…","Bans Rosling"));
        myBooks.add(new Book(Genre.HORROR,"Magnolia Table: A…","Joanna Gaines"));
        myBooks.add(new Book(Genre.FICTION,"Cagnolia Table: A…","Joanna Gaines"));
        return myBooks;
    }
}
