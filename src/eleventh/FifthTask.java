package eleventh;

public class FifthTask {
    public static void main(String[] args) {
        String str = args[0];

        if(isInteger(str)){
            System.out.println("Строка является целым числом");
        }
        else{
            System.out.println("Строка не является целым числом");
        }
    }
    static boolean isInteger(String str){
        for(int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);
            if(!Character.isDigit(temp)){
                return false;
            }
        }
        return true;
    }
}
