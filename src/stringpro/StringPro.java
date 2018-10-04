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
public class StringPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "this is java and is tough";
        String b = "hello";
        String cc = "hello";
//        System.out.println(a.length());
//        char c=a.charAt(4);
//        System.out.println(c);
//        int i=a.indexOf("is");
//        System.out.println("index "+i);
//        int ii=a.indexOf("is",3);
//        System.out.println("index "+ii);
//        String aa=a.substring(2);
//        System.out.println(aa);
//        int ab=cc.compareTo(b);
//        System.out.println(ab);
        if (cc == b) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        b = b + "hi";
        cc = cc + "hi";
        if (cc == b) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        b = b.intern();
        cc = cc.intern();

        if (cc.equals(b)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        String k = "hello";
        k = k.intern();
        String kk = "hello";

        if (k == kk) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        b = b.replace('e', 'o');
        System.out.println(b);

    }

}
