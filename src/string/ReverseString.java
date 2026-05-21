package string;

public class ReverseString {
    static void main(String[] args) {
        String s = "Ankit";
        char arr[] = s.toCharArray();
        for(int i = arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}
