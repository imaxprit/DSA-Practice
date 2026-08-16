package DSA_DAY_11;

public class UnionOfTwoArr {
    
    public static void main(String[] args) {
        
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};

        int union[] = new int[arr1.length + arr2.length];
        int k = 0;

        for(int i=0; i<arr1.length; i++) {
            union[k++] = arr1[i];
        }

        for(int i=0; i<arr2.length; i++) {
            boolean isDuplicate = false;

            for(int j=0; j<arr1.length; j++) {
                if(arr2[i] == arr1[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                union[k++] = arr2[i];
            }
        }

        System.out.println("Union of the two arrays: ");
        for(int i=0; i<k; i++) {
            System.out.print(union[i] + " ");
        }        
    }
}
