public class stringBufferDemo {
    public static void main(String[] args){
        /*
        thread safe , used in multithreading environment , methods synchronized
         */
        // playing with constructor
        StringBuffer sb = new StringBuffer(); // new sb object with initial capacity = 16
        StringBuffer sb1 = new StringBuffer(10) ;// sb object with desired capacity
        StringBuffer sb2 = new StringBuffer("java   ") ; // sb object from a string

        // important methods of the StringBuffer class
        System.out.println(sb2.length()) ;
        sb1.append("abcde");
        System.out.println(sb1.charAt(2)) ;
        sb2.trimToSize();

        sb2.setCharAt(1, 'o');
        System.out.println(sb2.charAt(1)) ;

        System.out.println(sb.capacity());
        System.out.println(sb.append('o').append(1)) ;
        System.out.println(sb.insert(2,"hi"));
        System.out.println(sb.delete(2,3));
        System.out.println(sb2.deleteCharAt(1));
        System.out.println(sb2.reverse());

    }
}
