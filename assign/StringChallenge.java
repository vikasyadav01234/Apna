public static void main(String[] args) {
    // Test cases for StringChallenge
    System.out.println(StringChallenge("fun&!! time")); // Expected: time
    System.out.println(StringChallenge("Hello world1234567")); // Expected: world1234567
}

public static String StringChallenge(String sen) {

    String[] words = sen.replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
    String longestWord = "";
    String firstLongestWord = "";
    for (String word : words) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        } else if (word.length() == longestWord.length() && longestWord.isEmpty()) {
            firstLongestWord = word;
        }

        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }
    String challengeToken = "q8engt34";
    String finalOutput = (longestWord.isEmpty() ? firstLongestWord : longestWord) + challengeToken;

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < finalOutput.length(); i++) {
        if (i % 4 == 0 && i != 0) {
            sb.append("_");
        }
        sb.append(finalOutput.charAt(i));
    }
    return sb.toString();
}
