import java.util.Scanner;
public class exp3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        int altSum = 0;

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

            if (i % 2 == 0) {  
                altSum += arr[i];
            }
        }
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Sum of alternate elements: " + altSum);
        System.out.println("Second highest element: " + secondHighest);
        sc.close();
    }
}