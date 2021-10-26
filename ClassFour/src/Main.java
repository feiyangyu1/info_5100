public class Main {

    public static void main(String[] args) {

        Publisher Ashish = new Publisher("Ashish","Info 5100");

        Student Mark = new Student("Mark",1);
        Student Luck = new Student("Luck",2);


        Mark.subscribe(Ashish);
        Luck.subscribe(Ashish);
        Luck.unSubscribe(Ashish);

        Ashish.addGrades(1,"A");
        Ashish.addGrades(2,"B");

        Ashish.notifyGrade();
    }
}
