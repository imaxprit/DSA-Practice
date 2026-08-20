package DSA_DAY_12;

public class StringQues {

    // Check if a String is pallindrome or not
    public static boolean isPallindrome(String str) {
        int n = str.length();
        for(int i=0; i<n/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    
    // find the shortest path to reach destination
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            // east, west, north south
            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            } else {
                y--;
            }
        }

        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2 + y2);
    } 


    public static void main(String args[]) {
        
        // System.out.println(isPallindrome("racecar"));
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
