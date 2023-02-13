package eleventh;

public class SixthTask {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(toInt(str));
    }

    static int toInt(String str){
        long result = 0;
        boolean wasMinus = false;
        boolean error = false;
        int digitCount = 0;
        int maxDigitCount = (Integer.MAX_VALUE + "").length();

        for(int i = str.length()-1; i >= 0 ; i--){
            char temp = str.charAt(i);
            if(Character.isDigit(temp)) {
                if(wasMinus) {
                    error = true;
                    break;
                }

                result += (temp - '0') * Math.pow(10, str.length() - 1 - i);
                digitCount++;

                if(digitCount > maxDigitCount) {
                    error = true;
                    break;
                }
            } else {
                if(temp == '-') {
                    result *= -1;
                    wasMinus = true;
                } else {
                    error = true;
                    break;
                }
            }
        }

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            error = true;
        }

        if(error)
            System.out.println("Pidrila detected");

        return (int)result;
    }
}
