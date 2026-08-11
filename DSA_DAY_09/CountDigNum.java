package DSA_DAY_09;

public class CountDigNum {
    
    // WAP to count the number of digits in a number
    public static void main(String[] args) {
        
        int num = 4560;
        int count = 0;

        int temp = Math.abs(num);

        if(temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("The Number of Digits: " + count);
    }
}
