package DSA_DAY_15;

public class StringBuilderProgram {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Delhi");
        System.out.println(sb);

        // adding a string
        sb.append(" India");
        System.out.println(sb);

        // insert at specific index
        sb.insert(0, "New ");
        System.out.println(sb);

        // replace character
        sb.replace(0, 3, "Old");
        System.out.println(sb);

        // delete 
        sb.delete(0, 4);
        System.out.println(sb);

        // reverse
        // sb.reverse();
        // System.out.println(sb);

        System.out.println(sb.charAt(2));

        sb.setCharAt(1, 'i');
        System.out.println(sb);

        System.out.println(sb.length());

        // capacity
        System.out.println(sb.capacity());

        // truncates or adds null chars
        System.out.println(sb);
        sb.setLength(8);
        System.out.println(sb);

        // substring
        System.out.println(sb.substring(0, 5));
    }
}
