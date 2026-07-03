import java.util.Scanner;

class ArrayInputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Output
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}