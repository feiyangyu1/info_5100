public class Main {

    private static int global = 100;

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int add = a + b;
        int remainder = a % b;
        int divide = a / b;
        int subtract = a - b;
        int multiply = a * b;

        System.out.println(remainder);
        System.out.println(divide);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(add);

//        unity operator +=

        a += 2; // a = a + 2
        System.out.println(a);

        a ++; // a = a + 1
        System.out.println(a);

        boolean bValue = true;
        if(bValue == true){
//      if(bValue)
            System.out.println("Boolean value is true");
        }

        if( a > 10 ){
            System.out.println("a is greater than 10");
        }else{
            System.out.println("a is less than 10");
        }

//        conditional operator == != >= > < <=

        b = 10;
        a = 22;
//        conditional operator && ||
        if(b == 10 && a > 20){
            System.out.println("b is equal to 10 and a is greater than 20");
        }

        b = 11;
        if(b == 10 || a > 20){
            System.out.println("b is equal to 10 or a is greater than 20");
        }

//        ternary operator ? :
//         result = (conditional expression) ? value 1 : value 2;
        int result = b < 10 ? 10 : 15;
        System.out.println(result);


        a = -5;
        a = ~a;
        a = a + 1;
        System.out.println("5 is:" + a);

        int[] arr = new int[5];
        int[] array = {1,2,3,4,5};
        System.out.println(array[1]);


        char[] name = {'a','b','c','d'};
        for (Character ch : name){
            System.out.println(ch);
        }

        System.out.println(name);
//        System.out.println(name.toString()); not working

        String firstName = "Roger";
        String lastName = "Yu";
        String myName = firstName + lastName;
        System.out.println(myName);
        printName(myName);

        NameClass newName = new NameClass("Roger","Yu");
        newName.firstName = "Rog";
        System.out.println(newName.firstName);




    }// End of main function

    private static void printName(String theName) {
        System.out.println(theName + global);
    }

}// End of the class
