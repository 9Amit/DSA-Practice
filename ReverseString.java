// Java program to reverse a string using two pointers

class GfG {
    static String reverseString(String s) {
        int left = 0, right = s.length() - 1;
      
        // Use StringBuilder for mutability
        StringBuilder res = new StringBuilder(s);
      
        // Swap characters from both ends till we reach
        // the middle of the string
        while (left < right) {
            char temp = res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;
            right--;
        }
  
        // Convert StringBuilder back to string
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abdcfe";
        System.out.println(reverseString(s));
    }
}