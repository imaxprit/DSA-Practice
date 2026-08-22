package DSA_DAY_14;

public class StringHandling {
    
    public static void main(String[] args) {
        
        String city = "New Delhi";
        String city1 = city.toUpperCase();
        String city2 = city1.toLowerCase();
        
        System.out.println(city);
        // System.out.println(city1);
        // System.out.println(city2);

        // String Length
        System.out.println((city.length()));

        // String character index
        System.out.println(city.charAt(4));

        // String subString
        System.out.println(city.substring(0, 4));
        System.out.println(city.substring(4));

        // equals
        String w1 = "Camel";
        String w2 = "camel";
        System.out.println(w1.equals(w2));
        System.out.println(w1.equalsIgnoreCase(w2));

        // String Concat
        String s1 = "Lucknow ";
        String s2 = "Uttar Pradesh";
        System.out.println(s1.concat(s2));

        // String trim
        String text = "   God Bless You    ";
        System.out.println(text.trim());

        // String replace
        System.out.println(w2.replace('c', 'm'));

        // String Contains
        System.out.println(s2.contains("radesh"));

        // compare to
        System.out.println("Banana".compareTo("Orange"));
    }
}
