public class LinearSearch {
    public static void main (String[] args) {

        int num[] = {2, 6, 7, 0};

        int arr = num.length;

        for (int i = 0; i < arr - 1 ; i++) {
            for (int j = 0; j < arr - i - 1; j++) {
                if (num[j] > num[j + 1]){

                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }

        }

        for (int nums: num) {
            System.out.println
        }
    }
}