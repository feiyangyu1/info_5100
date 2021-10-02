public class House {
//    Code > Generate > Getter and Setter

    public int houseNumber;
    public String color;

    public House(){
        System.out.println("default constructor");
    }

    public House(int houseNumber, String color){
        this.houseNumber = houseNumber;
        this.color = color;

    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
