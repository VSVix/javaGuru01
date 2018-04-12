package lv.javaguru18.lesson10.hashCodeAddreses;

import java.util.Objects;

public class Address {
    private final String street;
    private final int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number);
    }

    @Override
    public boolean equals(Object obj) {
//        if (this.equals(obj)) return true; STACK OVERFLOWW!!!
        if (this == obj) return true;

//        if (!Address.class.isAssignableFrom(obj.getClass())) return false;
        if (obj instanceof Address) {
            if (this.street == ((Address) obj).street & this.number == ((Address) obj).number) { return true; }
            return this.street == ((Address) obj).street & this.number == ((Address) obj).number;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
