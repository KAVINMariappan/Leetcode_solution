class Solution {

  public static int romanToInt(String s) {
    // Create a map to store Roman symbols and their corresponding integer values
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      int current = map.get(s.charAt(i));
      if (i + 1 < s.length() && current < map.get(s.charAt(i + 1))) {
        result -= current;
      } else {
        result += current;
      }
    }
    return result;
  }}