import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array: ");
        size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Index - " + i + " : ");
            array[i] = sc.nextInt();
        }
        int Even_sum = 0;
        float avg = 0;
        for (int i = 0; i < size; i++) {
           if (array[i] % 2 == 0) {
                Even_sum += array[i];
                avg = (float)Even_sum / (float)size;
           }
        }
        System.out.println("Sum of Even number : " + Even_sum);
        System.out.println("Average of Even number : " + avg);
        sc.close();
    }
}
