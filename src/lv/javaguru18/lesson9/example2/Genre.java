package lv.javaguru18.lesson9.example2;

public enum Genre {
    HORROR("Horror"),
    NOVEL("Novel"),
    ROMANCE("Romance"),
    FICTION("Fiction");

    private String title;
    Genre(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
