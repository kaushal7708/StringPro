/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpro;

import java.util.StringTokenizer;

/**
 *
 * @author Hemant-PC
 *
 */
public class ba {

    public static void main(String[] args) {
        // String n="  This is java and it is not easy gone";
        String n = "hello is this java ";
        // new StringTokenizer(n," ");
        /* while (st.hasMoreTokens()) { 
        StringTokenizer st =
        System.out.println(st.nextToken());*/
        int nums[] = {2, 10, 3, 4, 20, 5};
        int k[] = (tenRun(nums));
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
        /* int k[] = post4(n);
        for (int i = 0; i < k.length; i++) {
        System.out.println(k[i]);
        }*/
    }

    public static int[] tenRun(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                for (int j = i + 1; j < nums.length && nums[j] % 10 != 0; j++) {
                    nums[j] = nums[i];
                }
            }
        }
        return nums;
    }

    public static boolean modThree(int[] nums) {
        int k = 0, c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                k++;
            } else {
                k--;
            }
        }
        return (k == 3);
    }

    public static int[] post4(int[] nums) {
        int l = 0, i = nums.length - 1;
        for (; i >= 0; i--) {
            if (nums[i] == 4) {
                i++;
                break;
            } else {
                l++;
            }
        }
        int k[] = new int[l];
        for (int j = 0; j < k.length; j++, i++) {
            k[j] = nums[i];

        }
        return k;
    }

    /*System.out.println(repeatEnd(n, 1));
        System.out.println(dub("c"));
        System.out.println(catdog("catdog"));*/
 /*for (int i = 0; i < n.length(); i++) {
        if (n.charAt(i)==' ') {
        System.out.println(n.substring(start,i));
        start=i+1;
        }
        }
        System.out.println(n.substring(start));*/
    //  String as = "ab**cd";
    // System.out.println(starOut(as));
    public static String starOut(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int min = Math.min(str.length(), i + 2);//str.length() <= i + 2) ? str.length() : i + 2;
            int max = Math.max(0, i - 1);// ? 0 : i - 1;
            if (!(str.substring(max, min).contains("*"))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String starout(String str) {
        return str.replaceAll("(\\w?\\*\\w?)", "");
    }


    /*String s = "";
    
    s = str.substring(0, star - 1);
    System.out.println("1st "+s);
    for (int i = star+1; i < str.length() - 1; i++) {
    if (str.charAt(i) == '*') {
    
    }
    }
    return s;*/
 /*  int star = str.indexOf('*');
    String a = str.substring(0, star - 1), b;
    for (int i = star + 1; i < str.length() - 1; i++) {
    if (str.charAt(i) == '*') {
        b = str.substring(i + 1);
        if ((str.charAt(i + 1) == '*') && (str.charAt(i + 2) == '*')) {
            b = str.substring(i + 3);
            System.out.println("nested");
        } else if (str.charAt(i + 1) == '*') {
            b = str.substring(i + 2);
            System.out.println("else if");
        }
        str = a + b;
    }
}
    return str;
}*/
    public static int counthi(String s) {
        int c = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i') {
                c++;
            }
        }
        return c;
    }

    public static boolean catdog(String s) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'c' && s.charAt(i + 1) == 'a' && s.charAt(i + 2) == 't') {
                cat++;
            } else if (s.charAt(i) == 'd' && s.charAt(i + 1) == 'o' && s.charAt(i + 2) == 'g') {
                dog++;
            }
        }
        if (cat == dog) {
            return true;
        }
        return false;
    }

    public static String dub(String s) {
        String j = "";
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            j = j + c + c;
        }
        return j;
    }

    public static String repeatEnd(String str, int n) {
        if (str.length() > 1) {
            int i = str.length() - n;
            return str.substring(i) + str.substring(i) + str.substring(i);
        }
        return "";
    }

}
