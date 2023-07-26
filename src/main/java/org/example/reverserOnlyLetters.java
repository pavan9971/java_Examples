package org.example;

public class reverserOnlyLetters {
    public static void main(String[] args){
       System.out.println(reverse("a-bC-dEf-ghIj"));

    }
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;
        while ( i<j) {


            if (!Character.isLetter(s.charAt(i))) {
                i++;
            }
            if (!Character.isLetter(s.charAt(j))) {
                j--;
            } else {
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, s.charAt(i));
                i++;
                j--;

            }

        }
        return sb.toString();
    }

}
