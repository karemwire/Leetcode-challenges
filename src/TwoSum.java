import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  // given an array of int and a target return the position of
  // two numbers such that they add up to the given target.

  public int[] twoSum(int[] arr, int target) {
    //create a harsh map to loop through and find the numbers
    Map<Integer, Integer> container = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      // create a variable to check if the two number compliment each other
      int compliment = target - arr[i];

      //check to see if the container has the compliment number in it.
      //if not add into the container
      if (container.containsKey(compliment)) {
        return new int[]{container.get(compliment), i};
      }
      container.put(arr[i], i);
    }
    throw new IllegalArgumentException("None found!");

  }

  // test the result
  public static void main(String[] args)
  {
    int[] ls = {2, 7, 11, 15};
    int t = 9;
    TwoSum ts =  new TwoSum();
    System.out.println(Arrays.toString(ts.twoSum(ls, t)));

  }
}