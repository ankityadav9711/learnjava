package arrays;

public class SumAndAverageOfArray {
    static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 9, 6, 3};
        int sum = 0,avg = 0;
        for(int i = 0;i<arr.length;i++)
            sum = sum+arr[i];
        avg = sum/arr.length;
        {
            System.out.println("sum"+sum);
            System.out.println("avg"+avg);
        }
    }
}
