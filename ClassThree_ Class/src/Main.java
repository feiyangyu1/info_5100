import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        printDayofTheWeek(10);
//        printDayofTheMonth("feb");

        House h1 = new House();
        House h2 = h1;
        h1.color="White";
        h1.houseNumber=3;

//        System.out.println(h1.color);
//        System.out.println(h2.color);
//        h1.color="Red";
//        System.out.println(h2.color);
//        h2.color="Blue";
//        System.out.println(h1.color);
//        System.out.println(h2.color);

        House h3 = new House(3,"Yellow");
        System.out.println(h3.color);
    }

    static void printDayofTheMonth(String month) {
        switch (month.toLowerCase(Locale.ROOT)) {
            case "jan":
            case "feb":
                System.out.println("Spring");
                break;
            case "nov":
                System.out.println("Winter");
                break;
        }
    }
    static void printDayofTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
