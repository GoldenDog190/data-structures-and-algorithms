import java.util.Arrays;

public class ArrayReverse {
  public statis void main(String[] args) {
    int[] testArray = {1, 2, 3, 4, 5, 6};
    int[] reverseArr = reverseArr(testArray);
    System.out.println(Arrays.toString(testArray));
    System.out.println(Arrays.toString(reversedArray));

    reverseArrIn(testArray);
    System.out.println(Arrays.toString(testArray));
  }

  public statis void printArray(int[] input){
    System.out.print("[");
    for (int i = 0; i < input.length - 1; i++) {
      System.out.print(input[i] + ", ");
    }
    System.out.print(input[input.length - 1]);
    System.out.print("]");
    System.out.println();
  }

  public static int[] reverseArr(int[] input){
    int[] reversed = new int[input.length];
    int temp;
    for (int i = 0; i < input.length; i++){
      reversed[input.length - 1] = input[i];

    }
    return reversed;
  }
   
  public static int[] reverseArrInPlace(int[] array) {
    int temp;

    for (int i = 0; i < array.length/2; i++) {
      temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }
    return array;
  }

  }
   public static void test () {
     int x = -5;
     System.out.println(x/2);
   }
}