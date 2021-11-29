public class Task4FakeBinChangeIntOnStringAndCompare {
    public static void main(String[] args) {
        System.out.println(fakeBin("4"));

    }
    public static String fakeBin(String numberString){
        char [] chDigits = numberString.toCharArray();
        String result = "";

        for (int i = 0; i < numberString.length(); i++){
            if (Character.getNumericValue(chDigits[i]) < 5){
                result += "0";
            }
            else {
                 result += "1";
                }
            }
            return result;
        }

    }

