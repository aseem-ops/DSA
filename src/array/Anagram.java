package array;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        if(anagram.isAnagram("restful".toCharArray(),"fluster".toCharArray()))
            System.out.println("Strings are anagram");
        else System.out.println("Not Anagram");
    }

    private boolean isAnagram(char[] s1, char[] s2){
        //Sort both array
        Arrays.sort(s1);
        Arrays.sort(s2);
        //Compare if both Arrays are equal
        if (Arrays.equals(s1,s2)) return true;
        else return false;
    }
}
