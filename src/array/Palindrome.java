package array;

//The Time Complexity for this operation is O[n/2] which is linear as O[n]
public class Palindrome {
    public static void main(String[] args) {
        String inputStr[] = new String[]{"madam", "test", "racecar"};
        for (String input : inputStr) {
            if (isPalindrome(input)) {
                System.out.println("The String is Palindrome:  "+ input);
            } else {
                System.out.println("The String is Not Palindrome: "+ input);
            }
        }
    }

    public static boolean isPalindrome(String inputStr) {
        //First Covert the String into Char Array
        char arr[] = inputStr.toCharArray();
        //Define two pointers to hold the position as startIndex and endIndex
        int startIndex = 0;
        int endIndex = arr.length - 1;
        //Iterate and check the characters from both end
        while (startIndex < endIndex) {
            if (arr[startIndex] == arr[endIndex]) {
                startIndex++;
                endIndex--;
            } else {
                return false;
            }
        }
        return true;
    }
}
