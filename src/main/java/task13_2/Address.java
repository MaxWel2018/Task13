package task13_2;

public class Address {
    private int numberAppartment;
    private String nameStreet;

    @Override
    public String toString() {
        return "Address{" +
                "numberAppartment=" + numberAppartment +
                ", nameStreet='" + nameStreet + '\'' +
                '}';
    }

    public int getNumberAppartment() {
        return numberAppartment;
    }

    public void setNumberAppartment(int numberAppartment) {
        this.numberAppartment = numberAppartment;
    }

    public String getNameStreet() {
        return nameStreet;
    }

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }
}
