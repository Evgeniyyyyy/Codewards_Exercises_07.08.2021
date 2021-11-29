import java.util.Locale;

public class Task3StartsFirstLetterReturnTrue {
    public static void main(String[] args) {
        System.out.println(areYouPlaying("Rony"));
    }
    public static String areYouPlaying(String name) {
        String result;
        if (name.toLowerCase().charAt(0) == 'r') {
            result = String.format("%s plays banjo", name);
        } else {
            result = String.format("%s does not play banjo", name);
        }
        return result;

    }
}
