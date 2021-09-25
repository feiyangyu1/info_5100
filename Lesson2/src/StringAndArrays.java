public class StringAndArrays {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ABCDBA"));
        System.out.println(areAnagram("ABCAE","BEAAC"));
    }

    private static boolean isPalindrome(String str){
        if (str == null || str.length() <= 1){
            return true;
        }
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;

//        if(str.charAt(start) != str.charAt(end))
        while(start < end){
            if(arr[start] != arr[end]){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }//End of method isPalindrome

    private static boolean areAnagram(String str1, String str2){
        if(str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty())
            return false;

        if(str1.length() != str2.length())
            return false;

        int[] arr = new int[128];

        for(int i = 0 ; i < str1.length(); i++){
            arr[str1.charAt(i)] ++;
            arr[str2.charAt(i)] --;
        }

        for(int i = 0; i < 128; i++){
            if(arr[i] != 0)
                return false;
        }

        return true;
    }

}
