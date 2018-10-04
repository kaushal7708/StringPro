/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpro;

/**
 *
 * @author Hemant-PC
 */
public class A {

   // static int deleted = 0;
    //static int count = 0;

    /*A() {
    System.out.println("Created count=" + (count++));
    }*/
    /*
    @Override
    public void finalize() {
    System.out.println("deleted count" + (deleted++));
    }*/

    public static void main(String[] args) {
        /*for (int i = 0; i < 2147483647; i++) {
        new A();
        }*/int i=2;
        String s = "raman";
        System.out.println(s.substring(0, i)+s.substring(i+1));

        /* System.out.println(avg(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(avg(1, 2, 3, 4, 5));
        System.out.println(verify("ad.ss@gmail.com"));*/
    }

    /*i  public static int avg(int... ar) {
        int sum = 0, n = ar.length;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum / n;
    }

    public static boolean verify(String mail) {
        nt pos = mail.indexOf('@');
        int post =mail.indexOf(".");
        if (pos<0) {
        return false;
        }if (pos<2) {
        return false;
        }
        if (post<pos||post!=mail.length()-4) {
        return false;
        }*/
 /* if (mail.charAt(0) == '@' || mail.charAt(mail.length() - 1) == '@') {
        return false;
        }
        if (mail.charAt(0) == '.' || mail.charAt(mail.length() - 1) == '.') {
        return false;
        }
        if (mail.indexOf("@")>mail.indexOf(".")) {
        return false;
        }
        if (mail.contains("@") && mail.contains(".")) {
        
        
        return true;
        }
        return true;
    }

    public static boolean verifed(String mail) {
        return (mail.endsWith(".com") || mail.endsWith(".co.in") || mail.endsWith(".in") || mail.endsWith(".org") || mail.endsWith(".net") && mail.contains("@"));

    }*/
}
