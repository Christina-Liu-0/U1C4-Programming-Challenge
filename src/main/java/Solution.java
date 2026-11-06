public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        int len = x.length();
        String ending = x.substring(len-1,len);
        if (x.length() < 2) {
            return false;
        } else if (ending == "ly") {
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
        if (s1.substring(len1) == s2.substring(0, 1)) {
            String str = s2.substring(1);
            return s1 + str;
        } else {
        String newString = s1 + s2;
        return newString;
        }
    }

    public String withoutX(String s1) {
        int len = s1.length();
        if (s1.substring(0,1) == "x") {
            if (s1.substring(len-1) == "x") {
            return s1.substring(1, len-1);
        }
         return s1.substring(1);
        } if (s1.substring(len) == "x") {
            return s1.substring(0, len-1); 
        }
        return s1;
    }

    public String fizzString(String s1) {
        int len = s1.length();
        if (s1.substring(0,1) == "f") {
            if (s1.substring(len-1) == "b") {
                return "FizzBuzz";
            }
            return "Fizz";
        } 
         if (s1.substring(0, 2) == "b") {
                return "Buzz";
            }
            return s1;
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