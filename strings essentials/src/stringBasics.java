public class stringBasics {
    public static void main(String[] args){// creating strings using both the methods we learnt
    String s1 = "sachin";
    String s2 = new String("sachin");

    // string class constructor
    String s3 = new String(); // creates empty string

    StringBuffer sb = new StringBuffer("kolhivirat  ");
    String s4 = new String(sb);// string builder object to string

    char[] arr = new char[]{'a', 'b', 'c', 'd'};
    String s5 = new String(arr); // can pass char type array as well

    byte[] arr2 = new byte[]{0, 1, 2, 3};
    String s6 = new String(arr2); // passing byte type array

    // comparing strings using operator and equals methods
    System.out.println(s1 == s2);
    System.out.println( s1.equals(s2)) ;

    //printing all the var
        System.out.println(s1) ;
        System.out.println(s2) ;
        System.out.println(s3) ;
        System.out.println(s4) ;
        System.out.println(s5) ;
        System.out.println(s6) ;

    // important string methods
     System.out.println(s1.length());
     System.out.println(s2.charAt(2)) ;
     System.out.println(s2.indexOf('a'));
     System.out.println(s4.lastIndexOf('i'));
     System.out.println(s2.toUpperCase());
     System.out.println(s2.toLowerCase());
     System.out.println(s4.substring(2));
     System.out.println(s4.substring(1,4));
     System.out.println(s4.replace('i' , 'o'));

     // concatenating two strings - using operator and function
        System.out.println(s1.concat(s5));
        System.out.println(s1+s5);
}
}