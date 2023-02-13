package eleventh;

public class FirstTask {
    public static void main(String[] args) {
        String str = "Циклом называется многократное выполнение одних и тех же действий.";
        String argument = args[0];
        int i = str.indexOf(argument);
        int result = str.substring(0,i).replaceAll("[. ]", "").length();
        System.out.println(result);
    }
}
