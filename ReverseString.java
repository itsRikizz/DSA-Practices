import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static String reverseWord(String str) {
        char[] newArray = str.toCharArray();

        int l = 0;
        int r = newArray.length - 1;
        while (l < r) {
            char temp = newArray[l];
            newArray[l] = newArray[r];
            newArray[r] = temp;
            l++;
            r--;

        }

        String newString = new String(newArray);
        return newString;
    }

    public static void main(String[] args) {

        String str = "geegs";
        String reverse = reverseWord(str);
        System.out.println(reverse);
    }
}