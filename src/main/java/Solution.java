public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        int len = x.length();
        String ending = x.substring(len-1);
        if (x.length() < 2) {
            return false;
        }
        if (x.endsWith("ly")) {
            return true; 
        } else {
            return false;
        } 
    }

    public String conCat(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (s2 == "") {
            return s1;
        }
        if (s1.substring(len1, len1) == s2.substring(0, 1)) {
    String str = s2.substring(1);
            return s1 + str;
        } 
        String newString = s1 + s2;
        return newString;
    }

    public String withoutX(String s1) {
        int len = s1.length();
        if (s1.startsWith("x")) {
            if (s1.endsWith("x")) {
            return s1.substring(1, len-1);
        }
         return s1.substring(1);
        } if (s1.endsWith("x")) {
            return s1.substring(0, len-1); 
        }
        return s1;
    }

    public String fizzString(String s1) {
        int len = s1.length();
        if (s1.startsWith("f")) {
            if (s1.endsWith("b")) {
                return "FizzBuzz";
            }
            return "Fizz";
        } 
         if (s1.startsWith("b") || s1.startsWith("B")) {
                return "Buzz";
        }
        return "Buzz";
    }
    

    public String fizzString2(int x) {
        if (x%3 == 0) {
            if (x%5 == 0) {
                return "FizzBuzz!";
            }
            return "Fizz!";
        } else if (x%5 == 0) {
            return "Buzz!";
        }
        String str = x + "!";
        return str;
    }

}
