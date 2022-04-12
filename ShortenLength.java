public class ShortenLength {
    public static void main(String[] args) {
        String inputString = "wwwwaaadexxxxxx";
        StringBuilder outputString = new StringBuilder();
        int count = 1;
        for (int i = 0; i < inputString.length(); i++) {
            if (i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) {
                count++;
            } else {
                outputString.append(inputString.charAt(i)).append(count);
                count = 1;
            }
        }
        Print.printLine("Input data string :" + inputString);
        Print.printLine("Output data string after encoding :" + outputString);
    }
