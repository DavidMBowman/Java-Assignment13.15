package Assignment13_15;

import java.math.BigInteger;
import java.util.Scanner;

public class Assignment13_15 {
    public static void main(String args[]) {
        String n="",d="",str;
        try (Scanner in = new Scanner(System.in)) {

            System.out.print("Enter the first Rational Number : ");
            str = in.nextLine();
            int i;

            for(i=0;i<str.length();i++) {
                if(str.charAt(i)==' ')break;
                n+=str.charAt(i);
            }

            for(i++;i<str.length();i++) {
                d+=str.charAt(i);
            }
            
            BigInteger num1 = new BigInteger(n);
            BigInteger deno1 = new BigInteger(d);
            System.out.print("Enter the second Rational Number : ");
            str = in.nextLine();
            n="";
            d="";

            for(i=0;i<str.length();i++) {
                if(str.charAt(i)==' ')break;
                n+=str.charAt(i);
            }
            for(i++;i<str.length();i++) {
                d+=str.charAt(i);
            }
            
            BigInteger num2 = new BigInteger(n);
            BigInteger deno2 = new BigInteger(d);
            
            
            System.out.println(num1+"/"+deno1+" + "+num2+"/"+deno2 +" = "+
            (num1.multiply(deno2).add(num2.multiply(deno1)))+"/"+(deno1.multiply(deno2)));
            
            System.out.println(num1+"/"+deno1+" - "+num2+"/"+deno2 +" = "+
            (num1.multiply(deno2).subtract(num2.multiply(deno1)))+"/"+(deno1.multiply(deno2)));
            
            System.out.println(num1+"/"+deno1+" * "+num2+"/"+deno2 +" = "+
            num1.multiply(num2)+"/"+deno1.multiply(deno2));
            
            System.out.println(num1+"/"+deno1+" / "+num2+"/"+deno2 +" = "+
            num1.multiply(deno2)+"/"+deno1.multiply(num2));
            
            System.out.println(num2+"/"+deno2+" is "+num2.doubleValue()/deno2.doubleValue());
            in.close();
        }
    }
}
