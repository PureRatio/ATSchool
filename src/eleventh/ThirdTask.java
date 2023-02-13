package eleventh;

public class ThirdTask {
    public static void main(String[] args) {
        String str = args[0];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);
            if(temp == '1'){
                sb.append(0);
            }
            else if (temp == '0'){
                sb.append(1);
            }
            else{
                sb.append(temp);
            }
        }

        System.out.println(sb);
    }
}
