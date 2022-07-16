import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Validator
{
  // given a string s containing the following character '()',
  // '{}', or '[]' determine if the input string is valid
  public boolean isValid(String s)
  {
    // since the parenthesis are pairs create key value pair or map
    Map<Character, Character> map = new HashMap<>();
    map.put('}','{');
    map.put(']','[');
    map.put(')','(');

    //create a container in which you can put each element in the string.
    Stack<Character> stk =  new Stack<>();
    for (int i=0; i<s.length(); i++)
    {
      // get the current character to validate
      char currentChar = s.charAt(i);
      // if current char is in map put in the stack. Also, it is opening char!
      if(map.containsValue(currentChar))
      {
        stk.push(currentChar);
      }
      //in case of closing char
      else
      {
        // the stack is empty, and we have open char then false
        // or map.get is not same as stack.pop
        if (stk.isEmpty() || map.get(currentChar) != stk.pop())
        {
          return false;
        }
      }
    }
    return stk.isEmpty();

  }

  public static void main(String[] args) {
    Validator v = new Validator();
    System.out.println(v.isValid("({}[])"));
  }
}
