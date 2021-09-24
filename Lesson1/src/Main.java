public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int numOfStudentsInClass = 62;
        Integer test = new Integer(52);
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;

        System.out.println(max);
        System.out.println(min);

        System.out.println(maxShort);
        System.out.println(minShort);

        float maxFloat = Float.MAX_VALUE;
        float myFloat = 5.23f;
        float minFloat = Float.MIN_VALUE;

        System.out.println(maxFloat);
        System.out.println(minFloat);

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        System.out.println(maxDouble);
        System.out.println(minDouble);

        char ch = 'A';
        char cha = '\u0041'; //unicode

        System.out.println(ch);
        System.out.println(cha);

        boolean bTestValue = true;
        bTestValue = !bTestValue;
        System.out.println(bTestValue);

        long myLong = 5;
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println(maxLong);
        System.out.println(minLong);

        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println(maxByte);
        System.out.println(minByte);
    }
}
