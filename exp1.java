public class exp1 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 2};
        int min = arr[0];
        int max = arr[0];
        for (int x : arr) { //for (int i = 0; i < arr.length; i++)
            if (x < min) min = x;
            if (x > max) max = x;
        }
        System.out.println(max - min);
    }
}