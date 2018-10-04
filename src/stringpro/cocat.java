/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpro;

/**
 *
 * @author Hemant-PC
 *
 */
public class cocat {

    public static void main(String[] args) {
        int n[] = {1, 10, 2, 0, 20, 4, 2, 7, 2, 2};
        String a = "Hello";
        String str = "java";
        str = str.substring(str.indexOf('a'), str.indexOf('a') + 1) + str.substring(str.indexOf('a') + 2);
        /*int k[] = ten(n);
        for (int i = 0; i < k.length; i++) {
        System.out.println(k[i]);
        }*/
    }
    /*
    public static int[] ten(int n[]) {
    
    }*/

    public static boolean sum(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i] == 2 && n[i + 1] == 2) {
                return true;
            }

        }
        return false;
    }

    public static boolean con(String a) {
        if (a.length() >= 2) {
            if (a.substring(0, 2).equals(a.substring(a.length() - 2))) {
                return true;
            }
        }
        return false;
    }

    public static String withoutx2(String s) {
        if (s.charAt(0) == 'x') {
            s.charAt(s.indexOf('a'));

            s = s.substring(1);
            return s;
        }
        if (s.charAt(1) == 'x') {
            s = s.substring(0, 1) + s.substring(2);
            return s;
        }
        return s;
    }

    public static String minCat(String a, String b) {

        String s = "";
        if (a.length() > b.length()) {
            int i = a.length() - b.length();
            s = a.substring(b.length() + 1) + b;
        } else {
            s = a + b.substring(a.length() + 1);
        }
        return s;
        /*if (a.length() < b.length()) {
  return a+b.substring(i+1);
  
  }else{
  int i =b.length()- a.length();
  return a.substring(i+1)+b; 
  } 
         */
    }

}
