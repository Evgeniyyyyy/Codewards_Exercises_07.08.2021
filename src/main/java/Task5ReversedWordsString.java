public class Task5ReversedWordsString {
    public static void main(String[] args) {
        System.out.println(reverseWords("This is an example!"));
    }

    public static String reverseWords(String str){
        String[] str2 = str.split(" ");
        String result ="";
        for (int i = str2.length - 1; i >= 0; i--){
            result += String.format("%s ", str2[i]);
        }

        return result.trim();
    }
}
