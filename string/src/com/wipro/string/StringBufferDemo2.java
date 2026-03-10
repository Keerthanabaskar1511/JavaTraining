package com.wipro.string;
public class StringBufferDemo2 {
public static void main(String args[]) {
StringBuffer sb = new StringBuffer(19);
StringBuffer sb1 = new StringBuffer("Baskar");
System.out.println(sb.capacity());
sb.append("abcdefghijkimnop");
System.out.println(sb.capacity());
sb.append("qrst");
System.out.println(sb.capacity());
System.out.println(sb1.capacity());
System.out.println(sb1.length());
System.out.println(sb.charAt(5));
}
}