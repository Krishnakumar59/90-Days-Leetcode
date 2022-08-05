import java.util.Arrays;

public class leetcode1832_panagram {
    public static void main(String[] args) {
        String str = "Leetcode";
         boolean b=checkIfPangram(str);
         if(b==true){
             System.out.println("Pangram");
         }
         else {
             System.out.println("Not pangram");
         }

    }

    public static boolean checkIfPangram(String sentence) {
        boolean ans = false;
        if (sentence.length()<26) return false;
        for (int i = 0; i <= 26; i++) {
            if (sentence.indexOf((char)i+96)<0) return false;
        }
        return true;
    }
}

