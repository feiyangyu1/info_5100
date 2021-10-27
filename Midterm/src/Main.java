import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Printer p1;
        p1=Printer.getInstance();
        p1.getConnection();

	    int[] array = {1,3,-1,3,4,-1};
        System.out.println(returnRepeatedNumSum(array));

        String s = "abcabcbb";
        System.out.println(returnLongestSubstring(s));
    }

    public static int returnRepeatedNumSum(int[] arr){
        HashMap<Integer, Integer> counts = new HashMap<>();
        int sum = 0;
        for(int i : arr){
            counts.put(i,counts.getOrDefault(i,0)+1);
        }
        for(int i : counts.keySet()){
            if(counts.get(i) > 1)
                sum += i;
        }

        return sum;
    }

    public static String returnLongestSubstring(String str){
        char[] counts = new char[128];
        int left = 0, right = 0;
        String result = "";

        while(right<str.length()){
            char r = str.charAt(right);
            counts[r] ++;
            while(counts[r] > 1){
                char l = str.charAt(left);
                counts[l] --;
                left++;
            }
           if(str.substring(left,right+1).length() > result.length())
               result = str.substring(left,right+1);

            right ++;

        }

        return result;
    }

}
