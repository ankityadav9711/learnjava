package string;

public class RemoveAllWhiteSpace {
    static void main(String[] args) {
        String str1 = " J  A  V  A ";
        System.out.println(str1);
        String str2 = str1.replaceAll("\\s","");
        System.out.println(str2);
    }
}
