class Solution {
  public String reverseWords(String s) {
    String str = reverse(s.trim());
    StringBuilder sb = new StringBuilder();

    int start = 0;
    int end = str.indexOf(" ");

    while (start < str.length() && end != -1) {
      sb.append(reverse(str.substring(start, end)));
      sb.append(" ");
      start = end + 1;
      while (start < str.length() && str.charAt(start) == ' ') {
        start++;
      }
      end = str.indexOf(" ", start);
    }

    if (start < str.length()) {
      sb.append(reverse(str.substring(start)));
    }

    return sb.toString();
  }

  public String reverse(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }
}

