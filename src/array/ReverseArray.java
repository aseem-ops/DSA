package array;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] reversedArray=reverseArray.reverseArray(new int[]{1,2,3,4,5});
        for (int n: reversedArray){
            System.out.println(n);
        }
    }
    private int[] reverseArray(int arr[]) {
        //Start Index
        int startIndex = 0;
        //End Index
        int endIndex = arr.length -1;
        //Iterate the array
        for (int i = startIndex; i <= endIndex; i++) {
            swap(arr,startIndex,endIndex);
            startIndex++;
            endIndex--;
        }
        return arr;
    }

    private void swap(int arr[], int startIndex, int endIndex) {
         int temp = arr[startIndex];
         arr[startIndex] = arr[endIndex];
         arr[endIndex] = temp;
    }
}
