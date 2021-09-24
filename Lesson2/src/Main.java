public class Main {

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




    }// End of main function

}// End of the class
