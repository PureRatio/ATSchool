package twelfth;

public class SecondTask {
    public static void main(String[] args) {
        String[] words = args;

        if(words.length == 0){
            System.out.println("Пожалуйста, передайте значение в аргументы");
            return;
        }

        for (int i = 0; i < words.length; i++)
        {
            String str = words[i];
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (!(c >= '0' && c <= '9') && !(c >= 'a' && c <= 'z')) {
                    System.out.println("Слово должнно состоять только из строчных латинских букв и цифр");
                    return;
                }
            }
        }

        findLongestWord(words);
    }
    public static void findLongestWord(String[] words) {
        int longestLength = 0;

        for(String word : words){
            if(word.length() > longestLength){
                longestLength = word.length();
            }
        }

        for(String word : words){
            if(word.length() == longestLength) {
                System.out.printf("%s ", word);
            }
        }
    }
}