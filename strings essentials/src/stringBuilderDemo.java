public class stringBuilderDemo {
    public static void main(String[] args){
        /* not thread safe
        used in when there is no multi threading environment
        methods are not synchronized
         */

        // playing with the constructor
        StringBuilder sb1 = new StringBuilder();
        sb1.append("space");
        StringBuilder sb2 = new StringBuilder("Javaiscool");

        // methods
        System.out.println(sb1.append("world"));
        System.out.println(sb1.insert(7, "SO"));
        System.out.println(sb2.delete(3,6));
        System.out.println(sb2.charAt(4));
        sb1.setCharAt(5,'e');
        System.out.println(sb1);
        System.out.println(sb2.reverse());
        System.out.println(sb2.replace(4, 6, "no"));
        System.out.println(sb2.toString());

    }
}
