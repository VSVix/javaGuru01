package lv.javaguru18.lesson8.shapes;

public abstract class Shape {
    public abstract double calculateP();
    public abstract double calculateArea();

    public void printMe(){
        System.out.println(
                "---------------------------------------"+
                        "\nMy perimeter is : "+calculateP()+
                        "\nMy area is : "+calculateArea()
        );
    };

}
