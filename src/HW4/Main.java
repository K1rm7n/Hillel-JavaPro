package HW4;

import java.util.Arrays;

public class Main {
    public boolean isAnagram(String s, String t) {
        char arr1[] = s.toCharArray(), arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1.length != arr2.length) {
            return false;
        }
        String a = new String(arr1);
        String b = new String(arr2);
        return a.equals(b);
    }
}