package lv.javaguru18.lesson10.hashCodeAddreses;

public class Playground {

    public static void main(String[] args) {

        Address officeAddress = new Address("Gustava Zemgala", 76);
        Address javaGuruAddress = new Address("Stabu", 81);
        Address javaGuruAddress_2 = new Address("Stabu", 81);

        System.out.println(javaGuruAddress.equals(javaGuruAddress_2));
        System.out.println(javaGuruAddress);
    }




}
