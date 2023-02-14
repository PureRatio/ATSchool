package eleventh;

public class SixthTask {
    public static void main(String[] args) {
        String str = args[0];

        if(isInteger(str)) {
            long x = toInt(str) * 2L;
            System.out.println(x);
        } else {
            System.out.println("Не является нормальным целым числом");
        }
    }

    static boolean isInteger(String str) {
        boolean minusNotAlowed = false;
        boolean isPositive = true;

        for(int i = 0; i < str.length() ; i++) {
            char temp = str.charAt(i);
            if(Character.isDigit(temp)) {
                minusNotAlowed = true;
            } else {
                if(minusNotAlowed) {
                    return false;
                }
                if(temp == '-') {
                    minusNotAlowed = true;
                    isPositive = !isPositive;
                } else {
                    return false;
                }
            }
        }

        String maxInt = (isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE) + "";

        if(str.length() > maxInt.length()) return false;
        if(str.length() < maxInt.length()) return true;

        if(str.length() == maxInt.length()) {
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) > maxInt.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }

    static int toInt(String str){
        int result = 0;
        int x = str.charAt(0) != '-' ? 1 : -1;


        for(int i = str.length()-1; i >= 0 ; i--){
            char temp = str.charAt(i);
            if(Character.isDigit(temp)) {
                result += (temp - '0') * Math.pow(10, str.length() - 1 - i) * x;
            }
        }

        return result;
    }
}
