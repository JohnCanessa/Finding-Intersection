import java.util.Scanner;

/*
 * 
 */
public class Solution {

  /*
   * Return a string of numbers that occur in both strings in sorted order. If
   * there is no intersection, return the string "false".
   */
  static String FindIntersection(String[] strArr) {

    // **** ****
    StringBuilder sb = new StringBuilder();

    // **** for ease of use****
    String str1 = strArr[0];
    String str2 = strArr[1];

    // **** split first string ****
    String[] arr1 = str1.split(", ");

    // **** split second string ****
    String[] arr2 = str2.split(", ");

    // **** loop finding matches ****
    int i = 0;
    int j = 0;
    while (true) {

      // **** check if we are done ****
      if ((i >= arr1.length) || (j >= arr2.length))
        break;

      // **** check value from str1 in str2 ****
      int val1 = Integer.parseInt(arr1[i]);
      int val2 = Integer.parseInt(arr2[j]);

      // **** val1 == val2 ****
      if (val1 == val2) {
        if (sb.length() != 0)
          sb.append("," + String.valueOf(arr1[i]));
        else
          sb.append(String.valueOf(arr1[i]));
        i++;
        j++;
      }

      // **** val1 < val2 ****
      else if (val1 < val2) {
        i++;
      }

      // **** val1 > val2 ****
      else {
        j++;
      }
    }

    // **** check if there is no intersection ****
    if (sb.length() == 0)
      sb.append("false");

    // **** ****
    return sb.toString();
  }

  /*
   * Test scaffolding.
   */
  public static void main(String[] args) {

    // **** open scanner ****
    Scanner sc = new Scanner(System.in);

    // **** read the string ****
    String str = sc.nextLine();

    // ???? display the string ????
    System.out.println("main <<< str ==>" + str + "<==");

    // **** split the string ****
    String[] strArr = str.split("\", \"");

    // **** clean the substrings ****
    strArr[0] = strArr[0].substring(1);
    strArr[1] = strArr[1].substring(0, strArr[1].length() - 1);

    // ???? display strings ????
    System.out.println("main <<< strArr[0] ==>" + strArr[0] + "<==");
    System.out.println("main <<< strArr[1] ==>" + strArr[1] + "<==");

    // **** close scanner ****
    sc.close();

    // **** find intersection ****
    System.out.println("main <<< FindIntersection ==>" + FindIntersection(strArr) + "<==");
  }

}