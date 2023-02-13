package eleventh;

public class FourthTask {
    public static void main(String[] args) {
        String str = args[0];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);
            if(Character.isDigit(temp)){
                sb.append(temp);
            }
        }

        System.out.println(sb);
    }
}
