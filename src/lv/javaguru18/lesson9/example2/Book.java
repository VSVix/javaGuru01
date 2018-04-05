package lv.javaguru18.lesson9.example2;

public class Book implements Comparable<Book>{

    private String title;
    private String author;
    private Genre genre;

    public Book(Genre genre, String title, String author) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String toString(){
        return genre.getTitle() + " - " + title + " (" + author +")\n";
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    public String getAuthor() {
        return author;
    }
}
