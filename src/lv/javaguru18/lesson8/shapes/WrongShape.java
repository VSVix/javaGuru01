package lv.javaguru18.lesson8.shapes;

public class WrongShape extends RuntimeException {
    public WrongShape(String message, Exception ex) {
        super(message, ex);
    }
}
