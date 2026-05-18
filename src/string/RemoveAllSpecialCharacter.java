package string;

public class RemoveAllSpecialCharacter {
    static void main(String[] args) {
        String str1 ="%ja&&v*apro@1#%gra!&MMing*******678";
        System.out.println(str1);
        String str2=str1.replaceAll("[^a-zA-Z]","");
        System.out.println(str2);

    }
}
