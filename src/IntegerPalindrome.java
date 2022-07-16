public class IntegerPalindrome
{
  public boolean isPalindrome(int target)
  {
    int splitter = 0;
    if (target < 0 || (target % 10 == 0) && target !=0)
      return  false;
    while (target > splitter)
    {
      int pop = target % 10;
      target /=10;
      splitter = (splitter * 10) + pop;
    }
    return target == splitter || target == splitter / 10;
  }

  public static void main(String[] args)
  {
    IntegerPalindrome int_palindrome = new IntegerPalindrome();
    int number = 131;
    System.out.println(int_palindrome.isPalindrome(number));
  }
}
