public class exp2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {  //aray
            a[i] = (int)(Math.random() * 100);
        }

        System.out.println("Even index elements:");
        for (int i = 0; i < 10; i += 2)
            System.out.print(a[i] + " ");

        System.out.println("\nOdd elements:");
        for (int i = 0; i < 10; i++)
            if (a[i] % 2 != 0)
                System.out.print(a[i] + " ");

        System.out.println("\nReverse order:");
        for (int i = 9; i >= 0; i--)
            System.out.print(a[i] + " ");

        System.out.println("\nFirst and last element:");
        System.out.println(a[0] + " " + a[9]);
    }
}