package test;

public class Sample125 {

  public static void main(String[] args) {

    char[] charList = {'J', 'a', 'v', 'a'};      
    String text = new String(charList);
    String text2 = new String(" JAVA "); 
    String text3 = "Java Programming";
    String text4 = "JaVa";

    System.out.println("text:" + text);
    System.out.println("text2:" + text2);
    System.out.println("text3:" + text3);
    System.out.println("text4:" + text4 + '\n');

//    System.out.println("text length:" + text.length());
//    System.out.println("text2 length:" + text2.length());
//    System.out.println(text3.toLowerCase());
//    System.out.println(text3.toUpperCase());

//    System.out.println(text3.indexOf("Gram"));
//    System.out.println(text3.lastIndexOf('a'));

//    System.out.println(text.charAt(3));
//    System.out.println(text3.substring(2, 6));
//    System.out.println(text3.replace('a','b'));
//    System.out.println(text2.trim());
//    System.out.println(text.concat(text2));
//    System.out.println(text + text2);

    System.out.println(text.compareTo(text4));
    System.out.println(text.compareToIgnoreCase(text4));

    System.out.println(text.equals(text4));
    System.out.println(text.equalsIgnoreCase(text4));

    System.out.println(text4.startsWith("J"));
    System.out.println(text4.endsWith("A"));

  }

}
